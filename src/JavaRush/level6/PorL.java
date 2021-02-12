package JavaRush.level6;

import java.util.ArrayList;

public class PorL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int a = 0; a < strings.size(); a++) {
            if (strings.get(a).contains("л") && !strings.get(a).contains("р")) {
                strings.add(a, strings.get(a));
                a++;
            }
        }

        for (int a = 0; a < strings.size(); a++) {
            if (strings.get(a).contains("р") && !strings.get(a).contains("л")){
                strings.remove(a);
                a--;
            }
        }
        for (int a = 0; a < strings.size(); a++) {
            if (strings.get(a).contains("р") && strings.get(a).contains("л")) {
                continue;
            }
        }
        return strings;
    }
}
