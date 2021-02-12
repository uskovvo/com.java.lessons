package JavaRush.Level8.Lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }//напишите тут ваш код

    }

    public static void get10000(List list) {
//        int x = list.size() / 2;
        for (int i = 0; i < 10000; i++) {
            list.get(i);//напишите тут ваш код
        }
    }

    public static void set10000(List list) {
        for (int a = 0; a < 10000; a++){
            int b = 1;
            list.set(a, b);
            b++;//напишите тут ваш код
        }
    }

    public static void remove10000(List list) {
        for (int a = 0; a < 10000; a++){
            list.remove(a);//напишите тут ваш код
        }
    }
}
