package com.valera.java.lesson19;

public class Encapsulation {
    private int a = 9, b = 15;


    public int showResult(){
        return a + b;

    }

    public int getA() {     //методы Set и Get нужны, чтобы можно было изменить private переменные, не поломав их.
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
