package JavaRush.JavaCore.level15.Lesson12.Task2;

public class TeaMaker extends DrinkMaker{
    String teaCup = "Берем чашку для чая";
    String makeTea = "Насыпаем чай";
    String pourTea = "Заливаем кипятком";

    @Override
    void getRightCup() {
        System.out.println(teaCup);
    }

    @Override
    void putIngredient() {
        System.out.println(makeTea);
    }

    @Override
    void pour() {
        System.out.println(pourTea);
    }
}
