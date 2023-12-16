package interfaces_collections;

import interfaces_collections.interface_collections.Queue;

import java.util.Arrays;

public class QueueImp implements Queue {
    private Integer[] array;
    private int capacity = 10;
    private int index = 0;

    public QueueImp(int capacity) {
        array = new Integer[capacity];
    }

    public QueueImp() {
        array = new Integer[this.capacity];
    }

    @Override
    public boolean offer(Integer object) {
        boolean flag = true;
        if (this.array.length - 1 < this.index) {
            flag = false;
            System.out.print("");
        } else {
            this.array[this.index++] = object;
        }
        return flag;
    }

    @Override
    public Integer poll() {

        if (index == 0) {
            return null;
        } else {
            int num = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
                array[i] = null;
            }
            index--;
            return num;
        }
    }

    @Override
    public Integer peek() {
        if (array.length == 0) return null;
        return array[0];
    }

    public Integer[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        boolean flag = false;
        String array = "";
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null) {
                array += Integer.toString(this.array[i]);
                if (i == this.array.length - 1) {
                    flag = false;
                    break;
                }
                array += ", ";
                flag = true;
            }
        }
        if (flag) {
            String s = array.substring(0, array.length() - 2);
            array = s;
        }
        return "[" + array + "]";
    }
}
