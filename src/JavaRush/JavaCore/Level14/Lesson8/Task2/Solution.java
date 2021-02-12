package JavaRush.JavaCore.Level14.Lesson8.Task2;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Drink drink = new Wine();
        Wine wine = (Wine) drink;
        return wine;
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        Drink drink = new BubblyWine();
        BubblyWine bubblyWine = (BubblyWine) drink;
        return bubblyWine;
    }
}
