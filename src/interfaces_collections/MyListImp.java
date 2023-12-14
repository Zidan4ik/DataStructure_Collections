package interfaces_collections;

import java.util.Arrays;
import java.util.Objects;

public class MyListImp implements MyList {
    private Integer[] array;
    private int capacity = 0;
    private int index = 0;


    public MyListImp(int capacity) {
        this.capacity = capacity;
        array = new Integer[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public MyListImp() {
        this.capacity = 10;
        array = new Integer[this.capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public int size() {
        return array.length - (capacity - index);
    }

    @Override
    public boolean isEmpty() {
        if (this.index > 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean contains(Integer object) {
        boolean flag = false;
        for (int i = 0; i < array.length - this.index; i++) {
            if (!array[i].equals(null)) {
                if (array[i].equals(object)) {
                    flag = true;
                    break;
                }
            } else {

            }
        }
        return flag;
    }

    @Override
    public void add(Integer object) {
        int length = array.length;
        Integer[] arrayNew;
        if (this.index == capacity) {
            arrayNew = new Integer[length + 5];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            capacity = arrayNew.length;
            array = arrayNew;
        }
        array[index] = object;
        this.index++;
    }


    @Override
    public void add(int index, Integer object) {
        int length = array.length;
        Integer[] arrayNew;
        if (index == capacity) {
            arrayNew = new Integer[length + 5];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            capacity = arrayNew.length;
            array = arrayNew;
        } else if (length - (this.capacity - this.index) < index) {
            add(object);
        } else {
            array[index] = object;
        }

    }

    @Override
    public boolean remove(Integer object) {
        int indexRemove = 0;
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(object)) {
                indexRemove = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < array.length - 1; i++) {
                if (i >= indexRemove) {
                    array[indexRemove++] = array[i + 1];
                    array[i + 1] = null;
                }
            }
        }
        return flag;
    }

    @Override
    public void clear() {
        this.capacity=10;
        this.index=0;
        this.array = new Integer[this.capacity];
    }

    @Override
    public Integer get(int index) {
        for (int i = 0; i < this.array.length; i++) {
            if(i==index){
                return this.array[i];
            }
        }
        return null;
    }

    @Override
    public int indexOf(Integer object) {
        int index = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i]==(object)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Integer object) {
        int index = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i]==(object)){
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        Integer[] array = new Integer[this.array.length - (capacity - this.index)];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.array[i];
        }
        return Arrays.toString(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyListImp myListImp = (MyListImp) o;
        return capacity == myListImp.capacity && index == myListImp.index && Arrays.equals(array, myListImp.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, index);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
