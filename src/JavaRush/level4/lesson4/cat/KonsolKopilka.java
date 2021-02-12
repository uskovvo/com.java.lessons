package JavaRush.level4.lesson4.cat;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KonsolKopilka {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        int c = 0;

        while(true){

            String b = str.readLine();

            if (b.equals("сумма")){
                break;
            }else {
                int a = Integer.parseInt(b);
                c += a;
            }

        }
        System.out.println(c);
    }
}
