package JavaRush.JavaCore.level15.Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static int A;
    public static int B;

    static {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        try {
            A = Integer.parseInt(str.readLine());
            B = Integer.parseInt(str.readLine());
        }
        catch (IOException n){
        }
        try {
            str.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
