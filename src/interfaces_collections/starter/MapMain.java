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
        test1.put("christina",18);
        test1.put("grigoryi",1);
        test1.put("laska",123);
        test1.put("dmytro",1);
        test1.put("maksym",10);
        test1.put("masha",-5);
        test1.put("olexiy",33);
        test1.put("andriy",82);
        test1.put("ruslan",12);
        test1.put("mykola",50);
        test1.put("ivan",20);
        test1.put("katya",101);
        test1.put("katya123",101);


        System.out.println(test1.size());
        System.out.println(test1);
        System.out.println();

        System.out.println(test1.get("denys"));
        
    }
}
