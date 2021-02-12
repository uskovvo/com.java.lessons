package JavaRush.JavaCore.Level14.Lesson6;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if(Country.RUSSIA.equals(country)){
                return new RussianHen();//напишите тут ваш код
            }else if (Country.MOLDOVA.equals(country)){
                return new MoldovanHen();
            }else if (Country.BELARUS.equals(country)){
                return new BelarusianHen();
            }else if (Country.UKRAINE.equals(country)){
                return new UkrainianHen();
            }
            return hen;
        }
    }
}
