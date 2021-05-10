package JavaRush.JavaCore.Level18.Lesson3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Task5 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        ArrayList<Integer> listData = new ArrayList<Integer>();
        while (inputStream.available() > 0) listData.add(inputStream.read());
        inputStream.close();
        ArrayList<Integer> result = new ArrayList<Integer>(new HashSet<Integer>(listData));
        Collections.sort(result);

        for(int a = 0; a < result.size(); a++) {
            System.out.print(result.get(a) + " ");
        }
    }
}
