package interfaces_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        MyListImp array = new MyListImp(5);
        System.out.println("Array is empty?: " + array.isEmpty());
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(null);
        array.add(2);
        System.out.println(array);
        System.out.println(array.size());
        array.add(2);
        array.add(2);
        array.add(2);
        System.out.println(array);
        System.out.println(array.size());
        array.add(1,1);
        array.add(12,1);
        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.remove(1));
        System.out.println(array);
        System.out.println(array.size());
        array.clear();
        System.out.println(array);
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array);
        System.out.println(array.get(1));
        array.add(1);
        array.add(1);
        array.add(3);
        System.out.println();
        System.out.println(array.indexOf(1));
        System.out.println(array.lastIndexOf(1));

        new ArrayList<>().add(1);
        //        array.add(null);
//        System.out.println("Array is empty?: "+array.isEmpty());
//        System.out.println("Array: "+array);
//        System.out.println("Size: "+array.size());
//        System.out.println("Array contains value 5?: "+array.contains(5));
//        System.out.println("Array contains value 3?: "+array.contains(3));
//        System.out.println();
//
//        array.add(21,-2);
//        System.out.println(array);

    }
}
