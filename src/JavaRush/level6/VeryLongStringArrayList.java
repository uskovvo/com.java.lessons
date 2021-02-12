package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VeryLongStringArrayList {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        VeryLongStringArrayList.strings = new ArrayList<String>();
        for (int a = 0; a < 3; a++){
            String s = str.readLine();
            strings.add(s);
        }

        String longString = null;
        for (int b = 0; b < strings.size(); b++) {
            if (longString == null || strings.get(b).length() > longString.length()) {
                longString = strings.get(b);
            }
        }
        for (int c = 0; c < strings.size(); c++){
            if (longString.length() == strings.get(c).length()){
                System.out.println(strings.get(c));
            }
        }
    }        //напишите тут ваш код
}
