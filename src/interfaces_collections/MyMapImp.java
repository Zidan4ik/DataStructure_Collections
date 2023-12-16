package interfaces_collections;

import interfaces_collections.interface_collections.MyMap;

public class MyMapImp<S,I> implements MyMap {
    private S s;
    private I i;
    private Integer[] array;
    private int capacity = 16;
    private int index;
    public MyMapImp() {
        array = new Integer[capacity];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void put(String key, Integer value) {

    }

}
