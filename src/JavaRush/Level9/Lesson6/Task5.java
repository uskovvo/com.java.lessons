package JavaRush.Level9.Lesson6;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        try {//напишите тут ваш код

            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
