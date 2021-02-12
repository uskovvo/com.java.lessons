package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array10NumbersFromKeyboard {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int a = 0; a < list.length; a++){
            list[a] = Integer.parseInt(str.readLine());
        }
        System.out.println(list[9]);
        System.out.println(list[8]);
        System.out.println(list[7]);
        System.out.println(list[6]);
        System.out.println(list[5]);
        System.out.println(list[4]);
        System.out.println(list[3]);
        System.out.println(list[2]);
        System.out.println(list[1]);
        System.out.println(list[0]);
    }
}
