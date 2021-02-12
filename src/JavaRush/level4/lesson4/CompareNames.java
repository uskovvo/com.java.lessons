package JavaRush.level4.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNames {
    public static void main(String[] args) throws IOException {
        BufferedReader stroka = new BufferedReader(new InputStreamReader(System.in));
        String name1 = stroka.readLine();
        String name2 = stroka.readLine();

        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        }else if (name1.length() == name2.length()){
            System.out.println("Длины имён равны");
        }

    }
}
