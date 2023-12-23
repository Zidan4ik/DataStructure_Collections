package interfaces_collections.starter;


import interfaces_collections.interface_collections.Queue;
import interfaces_collections.realize.queue.MyLinkedList;

public class MyLinkedListMain {
    public static void main(String[] args) {
        Queue myQueue = new MyLinkedList();
        System.out.println(myQueue.offer(1));
        System.out.println(myQueue.offer(2));
        System.out.println(myQueue.offer(3));
        System.out.println(myQueue.offer(4));
        System.out.println(myQueue.offer(5));
        System.out.println(myQueue.offer(6));
        System.out.println(myQueue.offer(7));

        System.out.println("масив: "+ myQueue);
        System.out.println("видалення елементу: "+myQueue.poll());
        System.out.println("видалення елементу: "+myQueue.poll());
        System.out.println("видалення елементу: "+myQueue.poll());

        System.out.println("масив: "+myQueue);
        System.out.println("отримання першого елемента: "+myQueue.peek());
        System.out.println("масив: "+myQueue);


    }
}
