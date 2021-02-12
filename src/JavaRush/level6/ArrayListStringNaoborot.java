package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListStringNaoborot {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int a = 0; a < 5; a++){
            String s = str.readLine();
            list.add(s);
        }
        list.remove(2);
        Collections.reverse(list);
        for (int b = 0; b < list.size(); b++){
            System.out.println(list.get(b));//напишите тут ваш код
        }
    }
}
