package JavaRush.Level8.Lesson8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task4 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("SEPTEMBER 1 2020"));
        map.put("Петров", dateFormat.parse("JANUARY 8 1985"));
        map.put("Сидоров", dateFormat.parse("DECEMBER 5 1987"));
        map.put("Козлов", dateFormat.parse("APRIL 3 2020"));
        map.put("Ковров", dateFormat.parse("MAY 2 1977"));
        map.put("Логинов", dateFormat.parse("JUNE 7 2014"));
        map.put("Востриков", dateFormat.parse("OCTOBER 8 2016"));
        map.put("Валито", dateFormat.parse("MAY 1 1966"));
        map.put("Карасев", dateFormat.parse("MARCH 3 1987"));
        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Date> pair = itr.next();
            if (pair.getValue().getMonth() > 5 && pair.getValue().getMonth() < 9){
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
