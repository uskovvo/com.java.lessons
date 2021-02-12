package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Jolushka {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int a = 0; a < 20; a++){
            int b = Integer.parseInt(str.readLine());
            list.add(b);//напишите тут ваш код
        }
        printList(list).forEach(System.out::println);
    }

    public static ArrayList<Integer> printList(ArrayList<Integer> list) {
        ArrayList<Integer> intNa3 = new ArrayList<Integer>();
        ArrayList<Integer> intNa2 = new ArrayList<Integer>();
        ArrayList<Integer> intOther = new ArrayList<Integer>();

        for (int a = 0; a < list.size(); a++) {
            if (list.get(a) % 3 == 0) {
                intNa3.add(a);
                System.out.println(intNa3.get(a));//напишите тут ваш код
            } else if (list.get(a) % 2 == 0) {
                intNa2.add(a);
                System.out.println(intNa2.get(a));
            } else intOther.add(a);
            System.out.println(intOther.get(a));
        }
        return list;
    }
}
