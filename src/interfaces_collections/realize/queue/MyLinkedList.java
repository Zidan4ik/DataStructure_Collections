package interfaces_collections.realize.queue;

import interfaces_collections.interface_collections.Queue;

import java.util.Arrays;


public class MyLinkedList<E> implements Queue {
    private Node[] array;
    private Node head;
    private Node tail;
    private int count;

    public MyLinkedList() {
        head = null;
        this.array = new Node[5];
    }

    @Override
    public boolean offer(Integer object) {
        boolean isOffer = false;

        if (count < array.length) {
            Node newNode = new Node(object);

            if (this.head == null) {
                this.head = newNode;
            } else {
                this.tail.setNext(newNode);
                newNode.setPrevious(this.tail);
                newNode.setNext(null);
            }

            this.tail = newNode;
            this.array[count++] = newNode;
            isOffer = true;
        }

        return isOffer;
    }


    @Override
    public Integer poll() {
        if (this.head == null) {
            return null;
        }

        Node currentNode = this.head; //зберігаємо поточний ланцюг
        this.head = currentNode.getNext(); //дістаємо наступну ланку по ланцюгу

        if (this.head != null) { //отримали голову, тоді він не повинен мати передню ланку
            this.head.setPrevious(null);
        }

        for (int i = 0; i < this.count - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.count - 1] = null;
        this.count--;

        return (Integer) currentNode.getValue();
    }


    @Override
    public Integer peek() {
        if(this.head==null){
            return null;
        }else{
            return (Integer) this.array[0].getValue();
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
