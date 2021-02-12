package com.valera.java.lesson8;

public class References {
    public String str = "Моя строка";
    public String str2 = new String("Моя строка");

    public void foo(){
        new String("Моя строка");
        System.out.println(str2);
    }
}
