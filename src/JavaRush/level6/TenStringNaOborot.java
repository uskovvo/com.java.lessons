package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TenStringNaOborot {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String [] array = new String[10];

        for (int a = 0; a < array.length; a++){
            array[a] = str.readLine();
        }
        System.out.println(array[9]);
        System.out.println(array[8]);
        System.out.println(array[7]);
        System.out.println(array[6]);
        System.out.println(array[5]);
        System.out.println(array[4]);
        System.out.println(array[3]);
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[0]);
    }
}
