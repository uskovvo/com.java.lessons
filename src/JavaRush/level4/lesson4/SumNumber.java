package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double c;
        double count = 0;

        while (true){
            int b = Integer.parseInt(str.readLine());

            if (b == -1){
                break;
            }else {
                a = a + b;
                count++;
            }
        }
        c = a/count;
        System.out.println(c);
    }
}
