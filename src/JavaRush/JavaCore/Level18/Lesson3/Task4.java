package JavaRush.JavaCore.Level18.Lesson3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Task4 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String file = str.readLine();

        int[] list = new int[256];
        FileInputStream inputStream = new FileInputStream(file);
        while(inputStream.available() > 0){
            list[inputStream.read()]++;
        }
        inputStream.close();
        int max = Integer.MIN_VALUE;
        for(Integer a: list){
            if(a > 0 & a > max){
                max = a;
            }
        }
        List<Integer> list1 = new ArrayList<Integer>();
        for(int a = 0; a < list.length; a++){
            if (list[a] == max){
                list1.add(a);
            }
        }
        for(Integer a: list1){
            System.out.println(a + " ");
        }
    }
}
