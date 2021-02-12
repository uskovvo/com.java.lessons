package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String s = str.readLine();//напишите тут ваш код
        return s;
    }

    public static int readInt() throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(str.readLine());//напишите тут ваш код
        return a;
    }

    public static double readDouble() throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        double b = Double.parseDouble(str.readLine());
        return b;//напишите тут ваш код
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        boolean c = Boolean.parseBoolean(str.readLine());
        return c; //напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {

        System.out.println(ConsoleReader.readString());
        System.out.println(ConsoleReader.readInt());
        System.out.println(ConsoleReader.readDouble());
        System.out.println(ConsoleReader.readBoolean());
    }
}
