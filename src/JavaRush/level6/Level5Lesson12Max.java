package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Level5Lesson12Max {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = Integer.parseInt(reader.readLine());
        if (a <= 0) {
            return;
        }
        for (int b = 0; b < a; b++){
            int c = Integer.parseInt(reader.readLine());
            list.add(c);
        }
        maximum = list.get(0);
        for (int b = 0; b < list.size(); b++){
            if (list.get(b) > maximum){
                maximum = list.get(b);//напишите тут ваш код
            }
        }
        System.out.println(maximum);
    }
}
