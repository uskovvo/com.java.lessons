package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlusMinus {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());
        int c = Integer.parseInt(str.readLine());

        int count = 0;
        int count1 = 0;

        if (a>0){
            count++;
        }else if (a<0)
            count1++;
        if (b>0){
            count++;
        }else if (b<0)
            count1++;
        if (c>0){
            count++;
        }else if (c<0)
            count1++;
        System.out.println("количество отрицательных чисел: " + count1);
        System.out.println("количество положительных чисел: " + count);
    }
}
