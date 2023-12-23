package interfaces_collections.generics.arraylist;

public interface MyListG<E> {
    int size();
    boolean isEmpty();
    boolean contains(E object);
    void add(E object);
    void add(int index, E object);
    boolean remove(E object);
    void clear();
    E get(int index);
    int indexOf(E object);
    int lastIndexOf(E object);

}
