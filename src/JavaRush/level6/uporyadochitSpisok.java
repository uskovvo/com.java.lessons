package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class uporyadochitSpisok {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = str.readLine();
            list.add(s);
        }

        String bugString = list.get(0);

        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() >= bugString.length()) {
                bugString = list.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}
