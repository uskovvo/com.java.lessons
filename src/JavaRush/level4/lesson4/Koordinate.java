package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Koordinate {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());

        if (a>0 && b>0){
            System.out.println(1);
        }else if (a<0 && b>0){
            System.out.println(2);
        }else if (a<0 && b<0){
            System.out.println(3);
        }else if (a>0 && b<0){
            System.out.println(4);
        }
    }
}
