package JavaRush.level6;

import java.util.ArrayList;

public class asdfasd {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        list.add("роза");
        list.add("мера");
        list.add("лоза");
        list.add("лира");
        list.add("вода");
        list.add("упор");
        for (int a = 0; a < list.size(); a++){
            if(list.get(a).contains("л")) {
                list1.add(list.get(a));
                list1.add(a+1, list.get(a));
                a++;//напишите тут ваш код
            }
        }
        for (int a = 0; a < list.size(); a++){
            if(list.get(a).contains("р")){
                list.remove(a);
            }
        }
        System.out.println(list1.size());
    }
}
