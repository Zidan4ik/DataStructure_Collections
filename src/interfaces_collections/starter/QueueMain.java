package interfaces_collections.starter;

import interfaces_collections.QueueImp;
import interfaces_collections.interface_collections.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue myQueue = new QueueImp(3);
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
    }
}
