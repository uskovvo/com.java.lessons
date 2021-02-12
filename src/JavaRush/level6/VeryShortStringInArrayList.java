package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VeryShortStringInArrayList {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int a = 0; a < 3; a++){
            String s = str.readLine();
            list.add(s);
        }

        String shortString = null;
        for (int b = 0; b < list.size(); b++) {
            if (shortString == null || list.get(b).length() < shortString.length()) {
                shortString = list.get(b);
            }
        }
        for (int c = 0; c < list.size(); c++){
            if (shortString.length() == list.get(c).length()){
                System.out.println(list.get(c));
            }
        }
    }
}
