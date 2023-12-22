package interfaces_collections.starter;

import interfaces_collections.interface_collections.MyMap;
import interfaces_collections.realize.map.MyMapImp;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        /* *****Реалізація HashMap Interface***** */
        MyMap<String, Integer> myMap = new MyMapImp<>();
        System.out.println("Розмір масиву: "+myMap.size());
        System.out.println("Перевірка на пустоту колекції: "+myMap.isEmpty());
        myMap.put("roma",3);
        myMap.put("denys",2);
        myMap.put("christina",18);
        myMap.put("grigoryi",1);
        myMap.put("laska",123);
        myMap.put("dmytro",1);
        myMap.put("maksym",10);
        myMap.put("masha",-5);
        myMap.put("olexiy",33);
        myMap.put("andriy",82);
        myMap.put("ruslan",12);
        myMap.put("mykola",50);
        myMap.put("ivan",20);
        myMap.put("katya",101);
        myMap.put("katya123",101);
        System.out.println("Розмір масиву: "+myMap.size());
        System.out.println("Перевірка на пустоту колекції: "+myMap.isEmpty());
        System.out.println();
        System.out.println("Отримання елементу по ключу: "+myMap.get("denys"));
        System.out.println(myMap);
        System.out.println();
        System.out.println("Видалення елементу по ключу: "+myMap.remove("denys"));
        System.out.println(myMap);
        System.out.println("Розмір масиву: "+myMap.size());
        System.out.println();
        System.out.println("Отримання списку ключів з колекції: ");
        System.out.println(Arrays.toString(myMap.keyArray()));
        System.out.println("Отримання списку значень з колекції: ");
        System.out.println(Arrays.toString(myMap.valueArray()));

        System.out.println("Очищення колекції: ");
        myMap.clear();
        System.out.println(myMap);
    }
}
