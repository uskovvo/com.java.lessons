package JavaRush.JavaCore.Level18.Lesson11;

import java.io.*;


public class Task12 {
    public static void main(String[] args) throws IOException{
        String s = null;
        while (true){
            try{
                BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
                s = str.readLine();
                str.close();
                FileInputStream fileInputStream = new FileInputStream(s);
                fileInputStream.close();
            }catch (FileNotFoundException e){
                System.out.println(s);
                break;
            }
        }
    }
}
