package JavaRush.level6.cat1;

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();//напишите тут ваш код

    public Cat() {
    }

    public static void main(String[] args) {
        for (int a = 0; a < 10; a++){
            Cat cat = new Cat(); //создается десять объектов типа Cat
            Cat.cats.add(cat);   //все объекты Cat добавляются в ArrayList
        }

        printCats();
    }

    public static void printCats() {
        System.out.println(Cat.cats.size()); //выводит размер массива ArrayList
        for (int a = 0; a < cats.size(); a++){
            System.out.println(Cat.cats.get(a));//Выводит ссылку на каждый созданный объект Cat
        }
    }
}
