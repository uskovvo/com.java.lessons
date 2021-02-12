package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());
        int c = Integer.parseInt(str.readLine());

        if (a>0 && b>0 && c>0){
            System.out.println(3);
        }else if ((a>0 && b>0 && c<=0) || (a>0 && b<=0 && c>0) || (a<=0 && b>0 && c>0)){
            System.out.println(2);
        }else if ((a>0 && b<=0 && c<=0) || (a<=0 && b>0 && c<=0) || (a<=0 && b<=0 && c>0)) {
            System.out.println(1);
        }else System.out.println(0);


    }
}
