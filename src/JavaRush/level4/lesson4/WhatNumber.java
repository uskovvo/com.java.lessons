package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());
        int b = Integer.parseInt(str.readLine());
        int c = Integer.parseInt(str.readLine());

        if (a == b){
            System.out.println(3);
        }else if (b == c){
            System.out.println(1);
        }else if (a == c){
            System.out.println(2);
        }


    }
}
