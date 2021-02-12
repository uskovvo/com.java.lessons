package JavaRush.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Level7Lesson12TheEnd {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true){
            String s = reader.readLine();
            if (s.equals("end")){
                break;
            }else list.add(s);
        }
        for (int a = 0; a < list.size(); a++){
            System.out.println(list.get(a));
        }
    }
}
