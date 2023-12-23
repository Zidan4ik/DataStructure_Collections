package interfaces_collections.generics.linkedlist;

public interface QueueG<E> {
    boolean offer(E object);
    E poll();
    E peek();
}
