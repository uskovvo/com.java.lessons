package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Level7Lesson12MinMax {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] array = getInts();
        maximum = array[0];
        for(int a = 0; a < array.length; a++){
            if(array[a] > maximum){
                maximum = array[a];//напишите тут ваш код
            }
        }
        minimum = array[0];
        for(int a = 0; a < array.length; a++){
            if(array[a] < minimum){
                minimum = array[a];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
    static public int[] getInts() throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for(int a = 0; a < array.length; a++){
            array[a] = Integer.parseInt(str.readLine());
        }
        return array;
    }//напишите тут ваш код
}
