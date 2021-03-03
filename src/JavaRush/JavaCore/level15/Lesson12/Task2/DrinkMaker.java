package JavaRush.JavaCore.level15.Lesson12.Task2;

public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    public void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
