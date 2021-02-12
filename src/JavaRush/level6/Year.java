package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Year {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());

        if (a % 400 == 0) {
            System.out.println("количество дней в году: 366");
        }else if (a % 100 == 0){
            System.out.println("количество дней в году: 365");
        }else if (a % 4 == 0){
            System.out.println("количество дней в году: 366");
        }else System.out.println("количество дней в году: 365");
    }
}
