package JavaRush.JavaCore.Level18.Lesson5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        char a = 44;
        int count = 0;

        List<Character> list = new ArrayList<Character>();
        while(inputStream.available() > 0) {
            char c = (char) inputStream.read();
            if(c == a){
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
