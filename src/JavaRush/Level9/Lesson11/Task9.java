package JavaRush.Level9.Lesson11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task9 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);

    }

    public static Map<String, Cat> createMap() {
        Cat cat = new Cat("Васька");
        Cat cat1 = new Cat("Петька");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Чейз");
        Cat cat4 = new Cat("Рося");
        Cat cat5 = new Cat("Маркиз");
        Cat cat6 = new Cat("Сильвер");
        Cat cat7 = new Cat("Мурка");
        Cat cat8 = new Cat("Марсик");
        Cat cat9 = new Cat("Пушок");

        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put(cat.name, cat);
        map.put(cat1.name, cat1);
        map.put(cat2.name, cat2);
        map.put(cat3.name, cat3);
        map.put(cat4.name, cat4);
        map.put(cat5.name, cat5);
        map.put(cat6.name, cat6);
        map.put(cat7.name, cat7);
        map.put(cat8.name, cat8);
        map.put(cat9.name, cat9);

        return map;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            set.add(pair.getValue());//напишите тут ваш код
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
