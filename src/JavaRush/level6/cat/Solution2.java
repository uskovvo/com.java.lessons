package JavaRush.level6.cat;

public class Solution2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        // Создай 10 котов

        System.out.println(Cat.catCount);// Выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;// Создай статическую переменную catCount

        public Cat(){
            catCount++;
        }// Создай конструктор
    }
}
