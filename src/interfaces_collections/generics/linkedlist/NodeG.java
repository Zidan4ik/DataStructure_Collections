package interfaces_collections.generics.linkedlist;

public class NodeG<E>{
    private E value;
    private NodeG previous;
    private NodeG next;

    public NodeG(E value) {
        this.value = value;
        this.previous=null;
        this.next=null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public NodeG getPrevious() {
        return previous;
    }

    public void setPrevious(NodeG previous) {
        this.previous = previous;
    }

    public NodeG getNext() {
        return next;
    }

    public void setNext(NodeG next) {
        this.next = next;
    }
}
