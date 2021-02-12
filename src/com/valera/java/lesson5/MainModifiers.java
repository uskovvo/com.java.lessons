package com.valera.java.lesson5;


import com.valera.java.lesson16.Modifiers;

public class MainModifiers {
    public static void main(String[] args) {
        Modifiers mod = new Modifiers(1,12);
        mod.foo();
        String name = mod.name;
        System.out.println(name);

    }
}
