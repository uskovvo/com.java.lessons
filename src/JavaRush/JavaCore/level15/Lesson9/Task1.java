package JavaRush.JavaCore.level15.Lesson9;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static{
        labels.put(25.5, "kjdv");
        labels.put(36.45, "xcv");
        labels.put(1.1, "SDFFB");
        labels.put(252.21, "zdfvn");
        labels.put(3.214, "dfg");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}