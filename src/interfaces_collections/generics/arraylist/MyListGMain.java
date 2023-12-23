package interfaces_collections.generics.arraylist;



public class MyListGMain {
    public static void main(String[] args) {
        MyListG<String> myListG = new MyListGImp(5);
        myListG.add("1");
        myListG.add("2");
        myListG.add("3");
        myListG.add("4");
        myListG.add("5");

        myListG.add("3");
        myListG.add("3");
        myListG.add("5");
        myListG.add("12");
        System.out.println(myListG);
        myListG.add(2,"81");
        System.out.println(myListG);
        myListG.add(100,"301");
        System.out.println(myListG);

        myListG.add(3,"102");
        System.out.println(myListG);
        myListG.add(3,"0");
        myListG.add(5,"15");

        System.out.println(myListG.contains("2"));
        System.out.println(myListG.contains("8)"));

        System.out.println("Розмір масива 1: "+ myListG.size());
        myListG.add("100");
        System.out.println(myListG);
        System.out.println("Розмір масива 2: "+ myListG.size());
        myListG.add(1,"10");
        System.out.println(myListG);
        System.out.println("Розмір масива 3: "+ myListG.size());


        System.out.println("Дістаємо елемент по індексу 1: "+ myListG.get(1));
//        System.out.println("Дістаємо елемент по індексу 10: "+myList.get(50));
        System.out.println("Видалення елементу за значенням: "+ myListG.remove("81"));
        System.out.println(myListG);
        System.out.println("Дістати індекси за значенням: ");
        System.out.println(myListG.indexOf("3"));
        System.out.println(myListG.lastIndexOf("3"));
        System.out.println();
        System.out.println("Чи пустий масив: "+ myListG.isEmpty());
        System.out.println("Очищення масиву: ");
        myListG.clear();
        System.out.println(myListG);
        System.out.println("Чи пустий масив: "+ myListG.isEmpty());

    }
}
