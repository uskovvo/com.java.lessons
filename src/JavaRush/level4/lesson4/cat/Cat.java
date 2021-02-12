package JavaRush.level4.lesson4.cat;

public class Cat {
    public String name;
    public int age = 3;
    public int weight = 5;
    public String address;
    public String color = "null";

    public Cat (String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat (int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat (int weight, String color, String address) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;

    }
}
