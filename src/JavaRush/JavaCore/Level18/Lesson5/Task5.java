package JavaRush.JavaCore.Level18.Lesson5;

import jdk.jfr.StackTrace;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws DownloadException, IOException{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            FileInputStream inputStream = new FileInputStream(str.readLine());
            if (inputStream.available() < 1000) {
                throw new DownloadException();
            }
            inputStream.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
