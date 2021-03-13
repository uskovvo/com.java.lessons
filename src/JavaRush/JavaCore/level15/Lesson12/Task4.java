package JavaRush.JavaCore.level15.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (!(s = str.readLine()).equals("exit")) {
            try {
                if (s.contains(".")) {
                    print(Double.parseDouble(s));//напиште тут ваш код
                }else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) {
                        print(Integer.parseInt(s));
                } else if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128) {
                    print(Short.parseShort(s));
                } else print(s);
            }catch (NumberFormatException e){
                print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
