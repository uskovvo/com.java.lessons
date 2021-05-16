package JavaRush.JavaCore.Level18.Lesson11;

import java.io.*;

public class Task6 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(str.readLine(), true));
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(str.readLine()));
        BufferedInputStream inputStream1 = new BufferedInputStream(new FileInputStream(str.readLine()));

        while (inputStream.available() > 0){
                outputStream.write(inputStream.read());
        }
        inputStream.close();
        while(inputStream1.available() > 0){
            outputStream.write(inputStream1.read());
        }
        inputStream1.close();
        outputStream.close();
    }
}
