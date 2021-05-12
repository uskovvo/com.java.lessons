package JavaRush.JavaCore.Level18.Lesson5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(str.readLine());
        FileOutputStream outputStream = new FileOutputStream(str.readLine());

        ArrayList<Byte> list = new ArrayList<Byte>();
        if (inputStream.available() > 0){
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            System.out.println(count);
            for (int a = 0; a < count; a++){
                list.add(buffer[a]);
            }
            int count2 = count - 1;
            for(int a = 0; a < list.size(); a++){
                buffer[a] = list.get(count2);
                count2--;
            }
            outputStream.write(buffer, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}
