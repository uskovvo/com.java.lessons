package JavaRush.level4.lesson4.cat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Solution3 {

/*
Вывести на экран сегодняшнюю дату
*/
        public static void main(String[] args) {
            DateFormat dateFormat = new SimpleDateFormat("dd MM yy");
            Date date = new Date();
            System.out.println(dateFormat.format(date));//напишите тут ваш код
        }

}
