package interfaces_collections.realize.queue;

public class Node{
    private Object value;
    private Node previous;
    private Node next;

    public Node(Object value) {
        this.value = value;
        this.previous=null;
        this.next=null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
