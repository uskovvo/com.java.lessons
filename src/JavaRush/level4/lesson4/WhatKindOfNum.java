package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhatKindOfNum {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());

        String str1 = "отрицательное четное число";
        String str2 = "отрицательное нечетное число";
        String str3 = "ноль";
        String str4 = "положительное четное число";
        String str5 = "положительное нечетное число";

        if (a > 0 && a%2==0){
            System.out.println(str4);
        }else if (a > 0 && a%2!=0){
            System.out.println(str5);
        } else if (a == 0){
            System.out.println(str3);
        }else if (a < 0 && a%2==0){
            System.out.println(str1);
        }else System.out.println(str2);
    }
}
