package JavaRush.Level8.Lesson11;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Усков", "Валерий");
        map.put("Усков", "Олег");
        map.put("Рябова", "Эльвира");
        map.put("Рябова", "Алина");
        map.put("Харламов", "Валерий");
        map.put("Харламов", "Гарик");
        map.put("Батуллин", "Расим");
        map.put("Батулина", "Равия");
        map.put("Батуллин", "Марат");
        map.put("Батуллина", "Ника");//напишите тут ваш код
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
