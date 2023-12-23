package interfaces_collections.generics.hashmap;


import java.util.Arrays;

public class MapGMain {
    public static void main(String[] args) {
        /* *****Реалізація HashMap Interface***** */
        MyMapG<String, String> myMapG = new MyMapGImp();
        System.out.println("Розмір масиву: "+ myMapG.size());
        System.out.println("Перевірка на пустоту колекції: "+ myMapG.isEmpty());
        myMapG.put("roma","3");
        myMapG.put("denys","2");
        myMapG.put("christina","18");
        myMapG.put("grigoryi","1");
        myMapG.put("laska","123");
        myMapG.put("dmytro","1");
        myMapG.put("maksym","10");
        myMapG.put("masha","-5");
        myMapG.put("olexiy","33");
        myMapG.put("andriy","82");
        myMapG.put("ruslan","12");
        myMapG.put("mykola","50");
        myMapG.put("ivan","20");
        myMapG.put("katya","101");
        myMapG.put("katya123","101");
        System.out.println("Розмір масиву: "+ myMapG.size());
        System.out.println("Перевірка на пустоту колекції: "+ myMapG.isEmpty());
        System.out.println();
        System.out.println("Отримання елементу по ключу: "+ myMapG.get("denys"));
        System.out.println(myMapG);
        System.out.println();
        System.out.println("Видалення елементу по ключу: "+ myMapG.remove("denys"));
        System.out.println(myMapG);
        System.out.println("Розмір масиву: "+ myMapG.size());
        System.out.println();
        System.out.println("Отримання списку ключів з колекції: ");
        System.out.println(Arrays.toString(myMapG.keyArray()));
        System.out.println("Отримання списку значень з колекції: ");
        System.out.println(Arrays.toString(myMapG.valueArray()));

        System.out.println("Очищення колекції: ");
        myMapG.clear();
        System.out.println(myMapG);
    }
}
