package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kvadrat2 {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());
        for (int c = 1; c<=a; c++){
            for (int d = 1; d<b; d++){
                System.out.print(8);
            }
            System.out.println(8);
        }
    }
}
