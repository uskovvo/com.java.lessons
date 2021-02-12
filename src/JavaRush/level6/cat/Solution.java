package JavaRush.level6.cat;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(str.readLine());
        a = a % 5;

        if (a >= 0 && a <= 3){
            System.out.println("зеленый");
        }else if (a > 3 && a <= 4){
            System.out.println("желтый");
        }else if (a > 4 && a <= 5) {
            System.out.println("красный");
        }
    }
}
