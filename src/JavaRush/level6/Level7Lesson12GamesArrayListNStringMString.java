package JavaRush.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Level7Lesson12GamesArrayListNStringMString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for (int a = 0; a < n; a++){
            String s = reader.readLine();
            list.add(s);
        }
        for (int a = 0; a < m; a++){
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }
        for (int a = 0; a < list.size(); a++){
            System.out.println(list.get(a));
        }
    }
}
