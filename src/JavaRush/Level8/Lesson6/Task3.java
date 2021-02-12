package JavaRush.Level8.Lesson6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date currentDate = new Date();// напишите тут ваш код

        insert10000(list);

        Date nowDate = new Date();
        long delay = nowDate.getTime() - currentDate.getTime();// напишите тут ваш код
        return delay;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
