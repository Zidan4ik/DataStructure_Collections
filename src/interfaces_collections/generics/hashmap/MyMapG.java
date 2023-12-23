package interfaces_collections.generics.hashmap;

public interface MyMapG<K, V> {
    int size();

    boolean isEmpty();

    void put(K key, V value);

    boolean remove(K key);

    void clear();

    Integer get(K key);

    Object[] keyArray();

    Object[] valueArray();

}
