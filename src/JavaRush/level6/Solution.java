package JavaRush.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double indexMass = weight / (height * height);
            if (indexMass < 18.5){
                System.out.println("Недовес: меньше чем 18.5");// напишите тут ваш код
            }else if (18.5 <= indexMass && indexMass < 25){
                System.out.println("Нормальный: между 18.5 и 25");
            }else if (25<= indexMass && indexMass < 30){
                System.out.println("Избыточный вес: между 25 и 30");
            }else if (30 <= indexMass){
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
