package JavaRush.level6.cat;

public class Cat1 {
    private static int catCount = 0;

    public Cat1() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;//напишите тут ваш код

    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
