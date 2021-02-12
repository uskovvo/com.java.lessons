package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Name10Raz {
    public static void main(String[] args) throws Exception {
        BufferedReader str  = new BufferedReader(new InputStreamReader(System.in));
        String a = str.readLine();
        for (int b = 1; b<=10; b++){
            System.out.println(a + " любит меня.");
        }
    }
}
