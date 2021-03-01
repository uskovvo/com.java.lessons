package JavaRush.JavaCore.level15.Lesson9;

public class Task5 {
    public static Cat cat;
    static {
        cat = new Cat();
        cat.name = "Vaska";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
    public static class Cat {
        public String name;

    }
}


