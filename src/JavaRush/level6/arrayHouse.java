package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arrayHouse {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int evenCount = 0;
        int oddCount = 0;
        for (int a = 0; a < array.length; a++) {
            array[a] = Integer.parseInt(str.readLine());

            if (a == 0 && a % 2 ==0)
                evenCount += array[a];

            else
                oddCount += array[a];
        }

        if (evenCount > oddCount) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
