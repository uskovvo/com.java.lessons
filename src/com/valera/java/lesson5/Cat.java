package com.valera.java.lesson5;

public class Cat {
    public int age;
    public int weight;
    public int strength;
    int anotherCatCount = 0;
    int catCount = 0;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (anotherCat.age > this.age){
            anotherCatCount++;
        }else if (anotherCat.age < this.age){
            catCount++;
        }else if (anotherCat.age == this.age){
            anotherCatCount++;
            catCount++;
        }
        if (anotherCat.weight > this.weight){
            anotherCatCount++;
        }else if (anotherCat.weight < this.weight){
            catCount++;
        }else if (anotherCat.weight == this.weight) {
            anotherCatCount++;
            catCount++;
        }
        if (anotherCat.strength > this.strength){
            anotherCatCount++;
        }else if (anotherCat.strength < this.strength){
            catCount++;
        }else if (anotherCat.strength == this.strength) {
            anotherCatCount++;
            catCount++;
        }
        if (catCount <= anotherCatCount){
            return false;
        }else return true;


    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 12;
        cat.weight = 6;
        cat.strength = 75;

        Cat anotherCat = new Cat();
        anotherCat.age = 11;
        anotherCat.weight = 6;
        anotherCat.strength = 75;

        System.out.println(cat.fight(anotherCat));
    }
}
