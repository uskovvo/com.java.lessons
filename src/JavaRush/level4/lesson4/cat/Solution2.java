package JavaRush.level4.lesson4.cat;

public class Solution2 {
    public static void main(String[] args) {

    Mouse jerryMouse = new Mouse("Jerry", 12, 5);
    Cat tom = new Cat ("Tom", 10, "Blue");
    Dog spike = new Dog("Spike", 15, 50, "Grey");

    //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        String color;

        public Cat (String name, int age, String color){
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }

    public static class Dog {
        String name;
        int age;
        int weight;
        String color;

        public Dog (String name, int age, int weight, String color){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
        }
    }

            //напишите тут ваш код
}
