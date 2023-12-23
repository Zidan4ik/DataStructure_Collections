package interfaces_collections.generics.linkedlist;



public class MyLinkedListGMain {
    public static void main(String[] args) {
        QueueG<String> myQueueG = new MyLinkedListG();
        System.out.println(myQueueG.offer("1"));
        System.out.println(myQueueG.offer("2"));
        System.out.println(myQueueG.offer("3"));
        System.out.println(myQueueG.offer("4"));
        System.out.println(myQueueG.offer("5"));
        System.out.println(myQueueG);
        System.out.println(myQueueG.offer("6"));
        System.out.println(myQueueG.offer("7"));

        System.out.println("масив: "+ myQueueG);
        System.out.println("видалення елементу: "+myQueueG.poll());
        System.out.println("видалення елементу: "+myQueueG.poll());
        System.out.println("видалення елементу: "+myQueueG.poll());
        System.out.println("видалення елементу: "+myQueueG.poll());
        System.out.println("видалення елементу: "+myQueueG.poll());
        System.out.println("масив: "+myQueueG);
        System.out.println("отримання першого елемента: "+myQueueG.peek());
        System.out.println("масив: "+myQueueG);


    }
}
