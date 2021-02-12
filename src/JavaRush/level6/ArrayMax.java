package JavaRush.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMax {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [3];
        for (int a = 0 ; a < array.length; a++) {
            array[a] = Integer.parseInt(str.readLine());
        }// создай и заполни массив
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];// найди максимальное значение
            }
        }
        return max;
    }
}
