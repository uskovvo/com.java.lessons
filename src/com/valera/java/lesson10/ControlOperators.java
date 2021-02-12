package com.valera.java.lesson10;

public class ControlOperators {
    int a = 504, b =549, c = 523;
    boolean value = false;

    public void foo(){
        if (value){
            System.out.println("Yeeeee");

            if (a>b) {
                System.out.println("Noooo");
            }
        }
        else if (b<c){
            System.out.println("F...");

        }
        else {
            System.out.println("Table");
        }
    }
}
