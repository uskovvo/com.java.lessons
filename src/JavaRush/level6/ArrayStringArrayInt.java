package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayStringArrayInt<array1> {
    public static <array> void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String [] array = new String[10];
        int [] array1 = new int[10];

        for (int a = 0; a < array.length; a++){
            array[a] = str.readLine();
            int b = 0;
            array1[b] = array[a].length();
            System.out.println(array1[b]);
        }
    }
}
