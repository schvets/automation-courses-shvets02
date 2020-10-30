package lessons.lesson18;

import java.util.HashMap;
import java.util.Map;

public class LessonApp {
    public static void main(String[] args) {
        Map<MyKey, String> map = new HashMap<>();

        MyKey key1 = new MyKey("first",1);
        MyKey key2 = new MyKey("second",1);
        MyKey key3 = new MyKey("third",3);
        MyKey key4 = new MyKey("fourth",4);
        MyKey key5 = new MyKey("fifth",5);
        MyKey key6 = new MyKey("six",6);
        MyKey key7 = new MyKey("seventh",1);
        MyKey key8 = new MyKey("eight",1);


//        map.put(key1, "first");
//        map.put(key2, "second");
//        map.put(key3, "third");
//        map.put(key4, "fourth");
//        map.put(key5, "fifth");
//        map.put(key6, "six");
//        map.put(key7, "sevent");
//        map.put(key8, "eight");

//
//        MyKey key10 = new MyKey("key10", 10);
//        MyKey key11 = new MyKey("key11", 11);
//        MyKey key12 = new MyKey("key12", 12);
//        MyKey key13 = new MyKey("key13", 13);
//        MyKey key14 = new MyKey("key14", 14);
//        MyKey key15 = new MyKey("key15", 15);
//        MyKey key16 = new MyKey("key16", 16);
//        MyKey key17 = new MyKey("key17", 17);

//        map.put(key10, "key10");
//        map.put(key11, "key11");
//        map.put(key12, "key12");
//        map.put(key13, "key13");
//        map.put(key14, "key14");
//        map.put(key15, "key15");
//        map.put(key16, "key16");
//
//
//        map.entrySet();
//        for (Map.Entry<MyKey, String> e: map.entrySet()) {
//            System.out.println( e.getKey() + e.getValue());
//        }

        map.forEach((k,v) -> System.out.println(k + v));



    }
}
