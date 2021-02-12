package JavaRush.Level9.Lesson6;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        try {//напишите тут ваш код

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
