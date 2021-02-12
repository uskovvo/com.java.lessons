package JavaRush.JavaCore.Level13.lesson11;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String s = str.readLine();
        FileInputStream file = new FileInputStream(s);
        int a;
        while ((a = file.read()) != -1){
            System.out.print((char) a);
        }
    str.close();
        file.close();
    }
}
