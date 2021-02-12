package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Level7lesson12First {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int a = 0; a < 10; a++){
            int b = Integer.parseInt(str.readLine());
            list.add(b);
        }
        for(int a = 0; a < list.size(); a++){
            int b = list.size() - a - 1;
            System.out.println(list.get(b));
        }
    }
}
