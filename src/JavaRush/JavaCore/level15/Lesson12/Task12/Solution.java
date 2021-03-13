package JavaRush.JavaCore.level15.Lesson12.Task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        System.out.println(thePlanet.getClass().getSimpleName());
    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }


    //add static block here - добавьте статический блок тут
    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = str.readLine();

            if (s.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();// implement step #5 here - реализуйте задание №5 тут
            } else if (s.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else if (s.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else thePlanet = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
