package JavaRush.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());

        while(a != 0){
            if(a % 2 == 0){
                even++;//напишите тут ваш код
            }else odd++;
            a = a /10;
        }
        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}
