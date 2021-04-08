package JavaRush.JavaCore.Level16.Lesson13.Task2;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
        for (Thread thread : threads){
            thread.start();
        }
    }
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {

        @Override
        public void run() {
            while (true) {

                try {
                    System.out.println("HI");
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class Thread3 extends Thread {

        @Override
        public void run() {
            while(true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message{

        @Override
        public void run() {
            while(!isInterrupted()){

            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }

    }

    public static class Thread5 extends Thread{

        @Override
        public void run() {
            BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
            int c = 0;
            while(true){
                try{
                    String s = str.readLine();
                    if(s.equals("N"))
                        break;
                    c += Integer.parseInt(s);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println(c);
        }
    }
}
