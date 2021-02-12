package JavaRush.JavaCore.Level14.Lesson8;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());
        if (a <= 0) throw new Exception();
        if (b <= 0) throw new Exception();
        while (a != b){
            if (a > b){
                a = a - b;
            }else
                b = b - a;

        }
        System.out.println(a);
    }
}
