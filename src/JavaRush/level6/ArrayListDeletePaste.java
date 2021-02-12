package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListDeletePaste {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int a = 0; a < 5; a++){
            String s = str.readLine();
            list.add(s);
        }
        for (int b = 0; b < 13; b++){
            String v = list.get(4);
            list.remove(4);
            list.add(0, v);
        }
        for (int c = 0; c < list.size(); c++){
            System.out.println(list.get(c));
        }
    }
}
