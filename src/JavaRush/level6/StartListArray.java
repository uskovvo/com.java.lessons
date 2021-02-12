package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StartListArray {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int a = 0; a < 10; a++){
            String s = str.readLine();
            list.add(0, s);
        }
        for (int b = 0; b < list.size(); b++){
            System.out.println(list.get(b));
        }
    }
}
