package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListToLongOrToShort {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int shortString = 0;
        int longString = 0;

        for (int a = 0; a < 3; a++) {
            String s = str.readLine();
            list.add(s);
        }

        for (int b = 0; b < 3; b++) {
            int min = list.get(shortString).length();
            if (list.get(b).length() < min) {
                shortString = b;
            }
            int max = list.get(longString).length();
            if (list.get(b).length() > max) {
                longString = b;
            }
        }

        if (shortString < longString) {
            System.out.println(list.get(shortString));
        } else System.out.println(list.get(longString));

    }
}