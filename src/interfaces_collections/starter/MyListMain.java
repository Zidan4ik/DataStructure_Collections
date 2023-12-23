package interfaces_collections.starter;

import interfaces_collections.realize.MyListImp;
import interfaces_collections.interface_collections.MyList;

public class MyListMain {
    public static void main(String[] args) {
        MyList myList = new MyListImp(5);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        myList.add(3);
        myList.add(3);
        myList.add(5);
        myList.add(12);
        System.out.println(myList);
        myList.add(2,81);
        System.out.println(myList);
        myList.add(100,301);
        System.out.println(myList);

        myList.add(3,102);
        System.out.println(myList);
        myList.add(3,0);
        myList.add(5,15);

        System.out.println(myList.contains(2));
        System.out.println(myList.contains(8));

        System.out.println("Розмір масива 1: "+myList.size());
        myList.add(100);
        System.out.println(myList);
        System.out.println("Розмір масива 2: "+myList.size());
        myList.add(1,10);
        System.out.println(myList);
        System.out.println("Розмір масива 3: "+myList.size());


        System.out.println("Дістаємо елемент по індексу 1: "+myList.get(1));
//        System.out.println("Дістаємо елемент по індексу 10: "+myList.get(50));
        System.out.println("Видалення елементу за значенням: "+myList.remove(81));
        System.out.println(myList);
        System.out.println("Дістати індекси за значенням: ");
        System.out.println(myList.indexOf(3));
        System.out.println(myList.lastIndexOf(3));
        System.out.println();
        System.out.println("Чи пустий масив: "+myList.isEmpty());
        System.out.println("Очищення масиву: ");
        myList.clear();
        System.out.println(myList);
        System.out.println("Чи пустий масив: "+myList.isEmpty());

    }
}
