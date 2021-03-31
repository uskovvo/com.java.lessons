package JavaRush.JavaCore.Level16.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            Thread currentThread = Thread.currentThread();
            try {
                while (!currentThread.isInterrupted()){
                    seconds++;
                    Thread.sleep(1000);//add your code here - добавьте код тут
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
