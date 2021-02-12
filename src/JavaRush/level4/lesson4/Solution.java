package JavaRush.level4.lesson4;

public class Solution {
    public static void main(String[] args) {
        checkSeason(3);
        checkSeason(8);
        checkSeason(11);
        checkSeason(1);
    }

    public static void checkSeason(int month) {
        if (month == 12 || month == 1 || month == 2 ){
            System.out.println("Зима");
            //напишите тут ваш код
        }
        else if (month == 3 || month == 4 || month == 5){
            System.out.println("Весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        }
        else {
            System.out.println("Осень");
        }

    }
    //напишите тут ваш код


}
