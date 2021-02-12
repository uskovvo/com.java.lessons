package JavaRush.Level9.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
            readData();
    }

    public static void readData() {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try{
            for (int a = 0; a < list.size()+1; a++){
                int b = Integer.parseInt(str.readLine());
                list.add(b);
            }
        }
        catch (Exception e){
            for (int a = 0; a < list.size(); a++){
                System.out.println(list.get(a));
            }
        }
    }
}
