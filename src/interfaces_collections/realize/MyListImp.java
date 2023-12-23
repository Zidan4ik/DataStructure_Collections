

package interfaces_collections.realize;

import interfaces_collections.interface_collections.MyList;

import java.util.Arrays;
import java.util.Objects;

public class MyListImp implements MyList {
    private Integer[] array;
    private final int defaultCapacity = 10;
    private int index = 0;


    public MyListImp(int capacity) {
        this.array = new Integer[capacity];
    }

    public MyListImp() {
        this.array = new Integer[this.defaultCapacity];
    }

    @Override
    public int size() {
        return this.index;
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
        boolean isContains = false;
        for (int i = 0; i < this.index; i++) {
            if (!array[i].equals(null)) {
                if (array[i].equals(object)) {
                    isContains = true;
                }
            }
        }
        return isContains;
    }

    @Override
    public void add(Integer object) {

        int length = this.array.length;
        Integer[] arrayNew;
        if (this.index == this.array.length) {
            arrayNew = new Integer[length * 2];
            for (int i = 0; i < this.index; i++) {
                arrayNew[i] = this.array[i];
            }
            this.array = arrayNew;
        }
        this.array[index] = object;
        this.index++;
    }


    @Override
    public void add(int index, Integer object) {
        int length = this.array.length;
        Integer[] arrayNew;
        if (this.index == this.array.length) {
            arrayNew = new Integer[length * 2];
            for (int i = 0; i < this.index; i++) {
                arrayNew[i] = this.array[i];
            }
            this.array = arrayNew;
        }

        if (this.index < index) {
            this.array[this.index]=object;
        } else {
            for (int i = this.index; i > index; i--) {
                this.array[i] = this.array[i - 1];
            }
            this.array[index] = object;
        }
        this.index++;
        System.out.println(this.array.length);
    }

    @Override
    public boolean remove(Integer object) {
        int indexRemove = 0;
        boolean flag = false;

        for (int i = 0; i < this.index; i++) {
            if (this.array[i] != null && this.array[i].equals(object)) {
                indexRemove = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < this.index - 1; i++) {
                if (i >= indexRemove) {
                    this.array[indexRemove++] = this.array[i + 1];
                    this.array[i + 1] = null;
                }
            }
        }
        this.index--;
        return flag;
    }

    @Override
    public void clear() {
//        this.defaultCapacity =10;
        this.index = 0;
        this.array = new Integer[this.defaultCapacity];
    }

    @Override
    public Integer get(int index) {
        if (index >= 0 && index < this.index) {
            return this.array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + this.index);
        }
    }


    @Override
    public int indexOf(Integer object) {
        int index = 0;
        for (int i = 0; i < this.index; i++) {
            if (this.array[i] == (object)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Integer object) {
        int index = 0;
        for (int i = 0; i < this.index; i++) {
            if (this.array[i] == (object)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        Integer[] array = new Integer[this.index];
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
        return defaultCapacity == myListImp.defaultCapacity && index == myListImp.index && Arrays.equals(array, myListImp.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(defaultCapacity, index);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
