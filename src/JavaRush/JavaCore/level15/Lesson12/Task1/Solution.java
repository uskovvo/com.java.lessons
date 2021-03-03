package JavaRush.JavaCore.level15.Lesson12.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();//add your code here - добавьте код тут
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String s = str.readLine();
        if (s.equals("helicopter")){
            result = new Helicopter();//add your code here - добавьте код тут
        }else if (s.equals("plane")){
            int a = Integer.parseInt(str.readLine());
            result = new Plane(a);
        }
        str.close();
    }
}
