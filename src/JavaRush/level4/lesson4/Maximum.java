package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Maximum {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int i = Integer.parseInt(reader.readLine());

        if (i > 0) {
            for (int j = 0; j < i; j++) {
                int temp = Integer.parseInt(reader.readLine());
                if (temp > maximum) {
                    maximum = temp;
                }
            }
            System.out.println(maximum);
        }
    }
}

