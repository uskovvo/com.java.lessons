package com.valera.java.lesson5;

import com.valera.java.lesson19.Encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.showResult());
        encapsulation.setA(255); //метод Set переназначает данные переменной.
        System.out.println(encapsulation.getA()); //метод Get принимает значение переменной, причем не важно изменили ее или нет.
        encapsulation.setB(1522);
        System.out.println(encapsulation.getB());
    }
}
