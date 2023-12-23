

package interfaces_collections.generics.arraylist;


import java.util.Arrays;
import java.util.Objects;

public class MyListGImp<E> implements MyListG<E> {
    private Object[] array;
    private final int defaultCapacity = 10;
    private int index = 0;


    public MyListGImp(int capacity) {
        this.array = new Object[capacity];
    }

    public MyListGImp() {
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
    public boolean contains(E object) {
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
    public void add(E object) {

        int length = this.array.length;
        Object[] arrayNew;
        if (this.index == this.array.length) {
            arrayNew = new Object[length * 2];
            for (int i = 0; i < this.index; i++) {
                arrayNew[i] = this.array[i];
            }
            this.array = arrayNew;
        }
        this.array[index] = object;
        this.index++;
    }


    @Override
    public void add(int index, E object) {
        int length = this.array.length;
        Object[] arrayNew;
        if (this.index == this.array.length) {
            arrayNew = new Object[length * 2];
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
    public boolean remove(E object) {
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
    public E get(int index) {
        if (index >= 0 && index < this.index) {
            return (E)this.array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + this.index);
        }
    }


    @Override
    public int indexOf(E object) {
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
    public int lastIndexOf(E object) {
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
        Object[] array = new Object[this.index];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.array[i];
        }
        return Arrays.toString(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyListGImp myListImp = (MyListGImp) o;
        return defaultCapacity == myListImp.defaultCapacity && index == myListImp.index && Arrays.equals(array, myListImp.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(defaultCapacity, index);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
