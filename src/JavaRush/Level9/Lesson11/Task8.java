package JavaRush.Level9.Lesson11;

import java.util.ArrayList;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        Random rnd = new Random();
        int[] array = new int[5];
        for (int a = 0; a < array.length; a++){
            array[a] = rnd.nextInt();
        }
        int[] array1 = new int[2];
        for (int a = 0; a < array.length; a++){
            array[a] = rnd.nextInt();
        }
        int[] array2 = new int[4];
        for (int a = 0; a < array.length; a++){
            array[a] = rnd.nextInt();
        }
        int[] array3 = new int[7];
        for (int a = 0; a < array.length; a++){
            array[a] = rnd.nextInt();
        }
        int[] array4 = new int[0];

        list.add(array);
        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        return list;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
