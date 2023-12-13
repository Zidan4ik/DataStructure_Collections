package interfaces_collections;

import java.util.Arrays;

public class MyListImp implements MyList {
    private Integer[] array;
    private int capacity = 0;
    private int index = -1;


    public MyListImp(int capacity) {
        this.capacity=capacity;
        array = new Integer[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public MyListImp() {
        this.capacity=10;
        array = new Integer[this.capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        if (array.length == 0) isEmpty = true;
        if (array.length > 0) isEmpty = false;
        if (array.length < 0) new NegativeArraySizeException();
        return isEmpty;
    }

    @Override
    public boolean contains(Integer object) {
        return false;
    }

    @Override
    public void add(Integer object) {
        index++;
        int length = array.length;
        Integer[] arrayNew;
        if (index == capacity) {
            arrayNew = new Integer[length + 5];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            capacity = arrayNew.length;
            array = arrayNew;
        }
        array[index] = object;

    }


    @Override
    public void add(int index, Integer object) {

    }

    @Override
    public boolean remove(Integer object) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public int indexOf(Integer object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Integer object) {
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
