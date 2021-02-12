package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IWasBorn {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String name = str.readLine();
        int year = Integer.parseInt(str.readLine());
        int month = Integer.parseInt(str.readLine());
        int day = Integer.parseInt(str.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);
    }
}
