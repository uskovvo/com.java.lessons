package JavaRush.Level8.Lesson8;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
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
        map.put("Батуллина", "Равия");//напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countFirstname = 0;//напишите тут ваш код
        for (Map.Entry<String, String> pair : map.entrySet()){

            if (pair.getValue() == name){
                countFirstname++;
            }
        }
        return countFirstname;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countSecondName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().equals(lastName)){
                countSecondName++;//напишите тут ваш код
            }
        }
        return countSecondName;
    }

    public static void main(String[] args) {

    }
}
