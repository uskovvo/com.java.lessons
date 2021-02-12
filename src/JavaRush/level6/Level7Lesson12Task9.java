package JavaRush.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Level7Lesson12Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            resultStrings.add(string.toUpperCase());
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }

        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < resultStrings.size(); i++){
            String s = resultStrings.get(i);
            if ( s.length() % 2 == 0){
                String b = s + " " + s;
                newList.add(b);
            }else {
                String c = s + " " + s + " " + s;
                newList.add(c);
            }
        }
        for (int i = 0; i < newList.size(); i++){
            System.out.println(newList.get(i));
        }
    }
}
