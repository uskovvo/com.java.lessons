package com.valera.java.lesson5;

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Vasya", 35);
    }

    static class Person {
        public String name;
        public int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
