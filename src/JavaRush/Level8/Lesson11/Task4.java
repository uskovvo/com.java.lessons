package JavaRush.Level8.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
// Найти минимум тут
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<Integer>();
        int n = Integer.parseInt(str.readLine());
        for (int a = 0; a < n; a++){
            int m = Integer.parseInt(str.readLine());
            array.add(m);// Создать и заполнить список тут
        }
        return array;
    }
}
