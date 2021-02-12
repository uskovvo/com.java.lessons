package JavaRush.Level8.Lesson8;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(20);
        set.add(11);
        set.add(10);
        set.add(30);
        set.add(6);
        set.add(1);
        set.add(8);
        set.add(14);
        set.add(63);
        set.add(17);
        set.add(9);
        set.add(53);
        set.add(21);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(100);
        set.add(18);
        set.add(25);
        // напишите тут ваш код
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(a -> a > 10);
        return set;// напишите тут ваш код

    }

    public static void main(String[] args) {


    }
}
