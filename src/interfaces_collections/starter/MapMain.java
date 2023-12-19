package interfaces_collections.starter;

import interfaces_collections.interface_collections.MyMap;
import interfaces_collections.realize.map.MyMapImp;


import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String,Integer> l = new HashMap<>();
        l.put("1",2);
        l.put("2",2);
        l.put("christina",0);
        l.put("dasha",2);

        System.out.println(l);
        MyMap<String, Integer> test1 = new MyMapImp<>();
        test1.put("roma",3);
        test1.put("denys",2);
        test1.put("christina",0);
        test1.put("dasha",2);
        System.out.println(test1);
        System.out.println();

    }
}
