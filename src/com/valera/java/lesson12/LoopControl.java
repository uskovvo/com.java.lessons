package com.valera.java.lesson12;

public class LoopControl {

    boolean value = true;
    int a = 5, b = 6;

    public void foo(){

        while(a<b){
            System.out.println(a);
            a++;
        }
        do {
            System.out.println(a);
            a++;
        } while (a<b);

    }
}
