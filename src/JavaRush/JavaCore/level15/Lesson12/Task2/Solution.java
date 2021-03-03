package JavaRush.JavaCore.level15.Lesson12.Task2;

public class Solution {
    public static void main(String[] args) {
        LatteMaker latte = new LatteMaker();
        TeaMaker tea = new TeaMaker();

        tea.makeDrink();
        latte.makeDrink();
    }
}
