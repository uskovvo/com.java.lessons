package JavaRush.JavaCore.level15.Lesson12.Task2;

public class LatteMaker extends DrinkMaker{
    String latteCup = "Берем чашку для латте";
    String makeCoffee = "Делаем кофе";
    String pourCoffee = "Заливаем молоком с пенкой";

    @Override
    void getRightCup() {
        System.out.println(latteCup);
    }

    @Override
    void putIngredient() {
        System.out.println(makeCoffee);
    }

    @Override
    void pour() {
        System.out.println(pourCoffee);
    }
}
