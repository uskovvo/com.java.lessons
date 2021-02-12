package JavaRush.Level8.Lesson8;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task5 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Рябова1", "Эльвира");
        map.put("Рябова", "Алина");
        map.put("Усков1", "Валерий");
        map.put("Усков", "Олег");
        map.put("Николаев", "Олег");
        map.put("Харламов", "Валерий");
        map.put("Ускова", "Ольга");
        map.put("Батуллин1", "Расим");
        map.put("Батуллин", "Марат");
        map.put("Батуллина", "Равия");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
