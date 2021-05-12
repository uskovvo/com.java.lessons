package JavaRush.JavaCore.Level18.Lesson5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(str.readLine());

        FileOutputStream outputStream = new FileOutputStream(str.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(str.readLine());

        if(inputStream.available() > 0){
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);

            if(count % 2 == 0){
                int halfCount = count / 2;
                int halfCountMinusOne = halfCount - 1;
                System.out.println(halfCount);
                System.out.println(halfCountMinusOne);
                outputStream.write(buffer, 0, halfCount);
                outputStream1.write(buffer, halfCount, halfCount);
            }else {
                int halfCount1 = (count - 1) / 2;
                int halfCountPlusOne = halfCount1 + 1;
                System.out.println(halfCount1);
                System.out.println(halfCountPlusOne);
                outputStream.write(buffer, 0, halfCountPlusOne);
                outputStream1.write(buffer, halfCountPlusOne, halfCount1);
            }
        }
        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
