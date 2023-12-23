package interfaces_collections.realize;

import interfaces_collections.interface_collections.Queue;
import interfaces_collections.realize.queue.Node;

import java.util.Arrays;


public class QueueImp<E> implements Queue {
    private Node[] array;
    private Node head;
    private Node tail;
    private int count;

    public QueueImp() {
        head = null;
        this.array=new Node[5];
    }


    @Override
    public boolean offer(Integer object) {
       boolean isOffer = false;
       Node newNode = new Node(object);
       if(this.head==null && this.tail==null){
           this.head = newNode;
       }else{
           this.tail.setNext(newNode);
           newNode.setPrevious(this.tail);
           newNode.setNext(null);
       }
        this.tail = newNode;
        this.array[count++] = newNode;
        isOffer=true;
        return isOffer;
    }

    @Override
    public Integer poll() {
        Node curentNode = this.head;
        if(this.head==null){
            return null;
        }else{
            this.head = curentNode.getNext();
            this.head.setPrevious(null);
        }

        for (int i = 0; i < this.count - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.count - 1] = null;
        this.count--;
        return (Integer) this.array[0].getValue();
    }

    @Override
    public Integer peek() {
        return (Integer) this.array[0].getValue();
    }


    @Override
    public String toString() {
        String[] values = new String[this.count];
        for (int i = 0; i < this.count; i++) {
            values[i]=String.valueOf(this.array[i].getValue());
        }
        return Arrays.toString(values);
    }
}
