package JavaRush.JavaCore.Level18.Lesson11;

import java.io.*;

public class Task7 {
    public static void main(String[] args) throws Exception{
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = str.readLine();
        String fileName2 = str.readLine();
        str.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream inputFile1 = new BufferedInputStream(new FileInputStream(fileName1));
        BufferedInputStream inputFile2 = new BufferedInputStream(new FileInputStream(fileName2));
        BufferedOutputStream outputFile1 = new BufferedOutputStream(new FileOutputStream(fileName1));

        while (inputFile2.available() > 0){
            byteArrayOutputStream.write(inputFile2.read());
        }
        inputFile2.close();

        while (inputFile1.available() > 0){
            byteArrayOutputStream.write(inputFile1.read());
        }
        inputFile1.close();

        byteArrayOutputStream.writeTo(outputFile1);
        outputFile1.close();
    }
}
