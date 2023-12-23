package interfaces_collections.generics.linkedlist;


import java.util.Arrays;


public class MyLinkedListG<E> implements QueueG<E> {
    private NodeG<E>[] array;
    private NodeG head;
    private NodeG tail;
    private int count;

    public MyLinkedListG() {
        head = null;
        this.array = new NodeG[5];
    }

    @Override
    public boolean offer(E object) {
        boolean isOffer = false;

        if (count < array.length) {
            NodeG newNodeG = new NodeG(object);

            if (this.head == null) {
                this.head = newNodeG;
            } else {
                this.tail.setNext(newNodeG);
                newNodeG.setPrevious(this.tail);
                newNodeG.setNext(null);
            }

            this.tail = newNodeG;
            this.array[count++] = newNodeG;
            isOffer = true;
        }

        return isOffer;
    }


    @Override
    public E poll() {
        if (this.head == null) {
            return null;
        }

        NodeG currentNodeG = this.head; //зберігаємо поточний ланцюг
        this.head = currentNodeG.getNext(); //дістаємо наступну ланку по ланцюгу

        if (this.head != null) { //отримали голову, тоді він не повинен мати передню ланку
            this.head.setPrevious(null);
        }

        for (int i = 0; i < this.count - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.count - 1] = null;
        this.count--;

        return (E) currentNodeG.getValue();
    }


    @Override
    public E peek() {
        if(this.head==null){
            return null;
        }else{
            return this.array[0].getValue();
        }
    }


    @Override
    public String toString() {
        String[] values = new String[this.count];
        for (int i = 0; i < this.count; i++) {
            values[i] = String.valueOf(this.array[i].getValue()); //переводимо з integer в string і в масив
        }
        return Arrays.toString(values);
    }
}
