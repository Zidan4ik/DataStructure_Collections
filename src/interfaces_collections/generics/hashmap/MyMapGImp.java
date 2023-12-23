package interfaces_collections.generics.hashmap;


public class MyMapGImp<K,V> implements MyMapG<K,V> {
    private Node<K,V>[] array;
    private int count;
    private final int capacity = 16;
    private final double loadFactor = 0.75;

    public MyMapGImp() {
        array = new Node[capacity];
        this.count=0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = false;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i]!=null){
                isEmpty=true;
                break;
            }
        }
        return isEmpty;
    }

    @Override
    public void put(K key, V value) {
        if (checkSize()) {
            System.out.println("ємність масиву до збільшення: "+this.array.length);
            increaseSize();
            System.out.println("ємність масиву після збільшення: "+this.array.length);
        }
        int hashcode = hash(key);
        int index = findIndex(hashcode, array.length);
        if (this.array[index] == null) {
            this.array[index] = new Node<>();
        }
//        System.out.println("index: " + index);
        addEntry(hashcode, key, value, index);
        count++;
    }

    private boolean checkSize() {
        return (double)this.count / (double) this.array.length > this.loadFactor;
    }

    //створюємо новий масив, де вже значення, що перезапишуться, будуть мати інші позиції
    private void increaseSize() {
        this.count = 0;
        Node<K,V>[] newArray = this.array; // зберігаємо поточний масив
        int newCapacity = this.array.length * 2; // збільшення масиву
        this.array = new Node[newCapacity];
        for (int i = 0; i < newArray.length; i++) {
            Node node = newArray[i];
            while((node!=null) && (node.key != null && !node.key.equals(null))) { // перебираємо всю структуру в одному елементі
                int index = findIndex(node.hash,this.array.length);
            if(this.array[index]==null){
                this.array[index]=new Node<>();
            }
            addEntry(node.hash,node.key,node.value,index);
            this.count++;
            node=node.next;
            }
        }
    }

    @Override
    public boolean remove(K key) {
        Node node = new Node();
        Node previousNode = new Node();
        for (int i = 0; i < this.array.length; i++) {
            node = this.array[i];
            while(node != null && findIndex(hash(node.key),this.array.length)==i){ // перебираємо всі node за вказаним індексом
                if(node.key.equals(key)){  // якщо key true, то видаляємо node і міняємо ссилки
                    if(previousNode!=null){
                        previousNode.next=node.next;
                    }else{
                        this.array[i]=node.next;
                    }
                    this.count--;
                    return true;
                }
                previousNode=node;
                node=node.next;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        this.array = new Node[this.array.length];
        this.count = 0;
    }

    @Override
    public Integer get(K key) { //tyzhko napisaniy
        Node node = new Node();
        exit:
        for (int i = 0; i < this.array.length; i++) {
            node = this.array[i];
            while((node!=null) && findIndex(hash(key),this.array.length)==i){ // визначення позиції елементу в масиві
                if(node!=null && node.key.equals(key) && node.key==key){
                    break exit;
                }
                node=node.next;
            }
        }
        return findIndex(node.hash,this.array.length);
    }

    @Override
    public Object[] keyArray() {
        Object [] keys = new Object[this.count];
        Node node;
        int index = 0;
        for (int i = 0; i < this.array.length; i++) {
            node = this.array[i];
            while(node !=null && (node.key!=null && !node.key.equals(null))){ // перебираємо структуру linkedlist в елементах
                keys[index++] = (K)node.key;
                node = node.getNext();
            }
        }
        return keys;
    }

    @Override
    public Object[] valueArray() {
        Object [] values = new Object[this.count];
        Node node;
        int index = 0;
        for (int i = 0; i < this.array.length; i++) {
            node = this.array[i];
            while(node !=null && (node.key!=null && !node.key.equals(null))){// перебираємо структуру linkedlist в елементах
                values[index++] = (V) node.value;
                node = node.getNext();
            }
        }
        return values;
    }


    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        // побітове виключення(XOR) допомагає розподілити біти по хеш-коду у всьому діапазоні 32 бітів, для зменшення колізій
        // h >>> 16 - зсув на 16 позицій вліво для значення h(hashcode)
    }

    static int findIndex(int h, int length) {
        return h & (length - 1); // визначає індекс в межах нашого масиву
        //використовується побітове 'I' для обрізання hashcode так що біти попадали в діапазон 'length'
    }

    <S, I> void addEntry(int hashcode, S key, I value, int index) {
        Node node = this.array[index];
        if (node.hash == hashcode && (node.key.equals(key) || node.key == key)) {
            node.setValue(value);
            this.array[index] = node;
        } else {
            this.array[index] = new Node(hashcode, key, value, node);

        }
    }

    @Override
    public String toString() {
        String s = "{";
        for (Node node : this.array) {
            Node currentNode = node;

            while (currentNode != null && currentNode.next != null) {
                s += currentNode + "{"+findIndex(currentNode.hash, this.array.length)+"}, ";
                currentNode = currentNode.getNext();
            }
        }
        if(this.count>0) {return s.substring(0, s.length() - 2) + "}";}
        else {
            return "{}";
        }
    }

    static public class Node<S, I> {
        private int hash;
        private S key;
        private I value;
        private Node next;

        public int getHash() {
            return hash;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setHash(int hash) {
            this.hash = hash;
        }

        public void setKey(S key) {
            this.key = key;
        }

        public void setValue(I value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node() {
        }

        public Node(int hash, S key, I value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node(S key, I value) {
            this.key = key;
            this.value = value;
        }

        public Node(S key, I value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }


}
