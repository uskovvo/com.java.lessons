package JavaRush.Level9.Lesson11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task4 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        Date date = dateForm.parse(str.readLine());

        SimpleDateFormat dateForm1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateForm1.format(date).toUpperCase());

    }
}
