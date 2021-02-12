package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OpisNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        String str1 = str.readLine();
        int a = Integer.parseInt(str1);

        String s1 = "четное";
        String s2 = "нечетное";
        String s3 = "однозначное число";
        String s4 = "двузначное число";
        String s5 = "трехзначное число";



        if (a>1 && a<1000 && a%2==0 && str1.length() == 1){
            System.out.println(s1 + " " + s3);
        }else if (a>1 && a<1000 && a%2==0 && str1.length() == 2){
            System.out.println(s1 + " " + s4);
        }else if (a>1 && a<1000 && a%2==0 && str1.length() == 3) {
            System.out.println(s1 + " " + s5);
        }else if (a>=1 && a<1000 && a%2!=0 && str1.length() == 1){
            System.out.println(s2 + " " + s3);
        }else if (a>1 && a<1000 && a%2!=0 && str1.length() == 2) {
            System.out.println(s2 + " " + s4);
        }else if (a>1 && a<1000 && a%2!=0 && str1.length() == 3){
            System.out.println(s2 + " " + s5);
        }


    }
}
