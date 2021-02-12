package JavaRush.Level8.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int best = 0;
        for (int a = 0; a < 5; a++){
            list.add(Integer.parseInt(str.readLine()));
        }
        for (int a = 0; a < list.size(); a++){
            if (list.get(a).equals(list.get(a-1))){
                count++;
            }
        }
        System.out.println(best);
    }
}
