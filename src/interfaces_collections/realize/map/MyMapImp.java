package interfaces_collections.realize.map;

import interfaces_collections.interface_collections.MyMap;

import java.util.Arrays;

public class MyMapImp<S, I> implements MyMap {

    private Node<S, I>[] array;
    private int count;
    private final int capacity = 16;
    private final double loadFactor = 0.75;

    public MyMapImp() {
        array = new Node[capacity];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void put(String key, Integer value) {
        if (checkSize()) {
        }
        int hashcode = hash(key);
        int index = indexFor(hashcode, array.length);
        if (this.array[index] == null) {
            this.array[index] = new Node<>();
        }
        System.out.println("index: " + index);
        addEntry(hashcode, key, value, index);
        count++;
    }

    private boolean checkSize() {
        return count / array.length > loadFactor;
    }

    //створюємо новий масив, де вже значення, що перезапишуться, будуть мати інші позиції
    private void increaseSize(Node<S, I>[] array) {
        Node<S, I>[] increasedArray = this.array;
        this.array = new Node[array.length];

    }

    @Override
    public boolean remove(String key) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer get(String key) {
        return null;
    }

    @Override
    public String[] keyArray() {
        return new String[0];
    }

    @Override
    public Integer[] valueArray() {
        return new Integer[0];
    }


    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    static int indexFor(int h, int length) {
        return h & (length - 1);
    }

    <S, I> void addEntry(int hashcode, S key, I value, int index) {
        Node node = this.array[index];
        if (node.hash == hashcode && (node.key.equals(key) || node.key == key)) {
            node.setKey(key);
            node.setValue(value);
            this.array[index] = node;
        } else {
            array[index] = new Node(hashcode, key, value, node.getNext());
        }
        System.out.println(node.next);
    }

    @Override
    public String toString() {
        String s = "{";
        for(Node node: this.array){
            Node currentNode = node;

            while(currentNode!=null && currentNode.next!=null){
                s += currentNode + ", ";
                currentNode=currentNode.getNext();
            }
        }
        //s += array[i] + ", ";
        return s + "}";
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

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }


}