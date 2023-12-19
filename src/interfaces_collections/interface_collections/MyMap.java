package interfaces_collections.interface_collections;

public interface MyMap<S, I> {
    int size();

    boolean isEmpty();

    void put(String key, Integer value);

    boolean remove(String key);

    void clear();

    Integer get(String key);

    String[] keyArray();

    Integer[] valueArray(); 

}
