package JavaRush.Level10.Lesson11;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[2];
        arrayOfStringList[0] = new ArrayList<String>();
        arrayOfStringList[1] = new ArrayList<String>();
        arrayOfStringList[0].add("sdf");
        arrayOfStringList[1].add("sdfs");
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
