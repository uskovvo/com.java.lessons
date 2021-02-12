package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StrokaNRaz {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String s = str.readLine();
        int a = Integer.parseInt(str.readLine());
        int b = 1;

        while (b<=a){
            System.out.println(s);
            b++;
        }
    }
}
