package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortThreeNum {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());
        int c = Integer.parseInt(str.readLine());

        if(a >= b && b>=c){
            System.out.println(a + " " + b + " " + c);
        }else if (a>=c && c>=b){
            System.out.println(a + " " + c + " " + b);
        }else if (b>=a && a>=c){
            System.out.println(b + " " + a + " " + c);
        }else if(b>=c && c>=a){
            System.out.println(b + " " + c + " " + a);
        }else if(c>=a && a>=b){
            System.out.println(c + " " + a + " " + b);
        }else if(c>=b && b>=a){
            System.out.println(c + " " + b + " " + a);
        }
    }
}
