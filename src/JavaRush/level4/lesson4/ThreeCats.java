package JavaRush.level4.lesson4;

public class ThreeCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cheiz", 10, 8, 97);
        Cat cat2 = new Cat("Rosya", 9, 8,98);
        Cat cat3 = new Cat("Kapa", 0, 1, 100);
    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
