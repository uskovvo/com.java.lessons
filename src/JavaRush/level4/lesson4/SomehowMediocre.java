package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SomehowMediocre {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());
        int c = Integer.parseInt(str.readLine());

        if ((a>b) && (b>c) || (a<b) && (b<c)){
            System.out.println(b);
        }else if ((a>c) && (b>a) || (c>a) && (a>b)){
            System.out.println(a);
        }else if ((a>c) && (b<c) || (a<c) && (c<b)){
            System.out.println(c);
        }else if (a==b && b>c && a>c || a==b && b<c && a<c){
            System.out.println(a);
        }else if (b==c && b>a && c>a || b==c && a>b && a>c){
            System.out.println(c);
        }else if (a==c && a>b && c>b || a==c && a<b && c<b){
            System.out.println(c);
        }else if (a==b && b==c){
            System.out.println(b);
        }
    }
}
