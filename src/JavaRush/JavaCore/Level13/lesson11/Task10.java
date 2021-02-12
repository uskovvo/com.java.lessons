package JavaRush.JavaCore.Level13.lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String s = str.readLine(); //читаем с консоли
        FileInputStream file = new FileInputStream(s); //открываем файл введеный с консоли
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(file)); //читаем данные из файла
        String text;
        try {
            while ((text = reader.readLine()) != null) {
                int x = Integer.parseInt(text);
                if (x % 2 == 0)
                    list.add(x); //записываем считанные числа из файла в массив
            }

            Collections.sort(list);

            for (int x = 0; x < list.size(); x++) {
                System.out.println(list.get(x));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        finally{
            str.close();
            file.close();
            reader.close();
        }
    }
}
