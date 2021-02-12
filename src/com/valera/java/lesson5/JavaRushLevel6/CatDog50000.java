package com.valera.java.lesson5.JavaRushLevel6;

public class CatDog50000 {
    public static void main(String[] args) {
        for(int i = 0; i < 50000; i++){
            Cat cat = new Cat();
            Dog dog = new Dog();// напишите тут ваш код
        }// напишите тут ваш код
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
