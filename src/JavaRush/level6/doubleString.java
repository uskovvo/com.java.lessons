package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class doubleString {
    public static void main(String[] args) throws Exception{
    BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();// Считать строки с консоли и объявить ArrayList list тут
    for (int a = 0; a < 2; a++){
        String s = str.readLine();
        list.add(s);
    }
    ArrayList<String> result = doubleValues(list);
        result.forEach(System.out::println);// Вывести на экран result
}

    public static ArrayList<String> doubleValues(ArrayList<String> list) {

        for (int a = 0; a < list.size(); a++){
            list.add(a+1, list.get(a));
            a++;//напишите тут ваш код
        }
        return list;
    }
}
