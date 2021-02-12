package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WhatYourAge {
    public static void main(String[] args) throws IOException {
        BufferedReader stroka = new BufferedReader(new InputStreamReader(System.in));
        String name = stroka.readLine();
        int age = Integer.parseInt(stroka.readLine());



        if (age < 18){
            System.out.println(name);
            System.out.println("Подрасти еще");
        }else if (age >= 18){
        }
    }
}
