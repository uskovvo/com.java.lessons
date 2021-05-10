package JavaRush.JavaCore.Level18.Lesson3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String file = str.readLine();

        int minByte = 255;
        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0){
            int myByte = inputStream.read();
            if (minByte > myByte){
                minByte = myByte;
            }
        }
        inputStream.close();
        System.out.println(minByte);
    }
}
