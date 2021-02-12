package JavaRush.level6;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Hi");
        list.add(1, "Table");
        list.add(2, "Mouse");
        list.add(3, "Tea");
        list.add(4, "Notebook");

        System.out.println(list.size());
        for (int a = 0; a < list.size(); a++){
            System.out.println(list.get(a));
        }
    }
}
