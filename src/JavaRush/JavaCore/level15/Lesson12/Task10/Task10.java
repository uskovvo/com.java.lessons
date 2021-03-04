package JavaRush.JavaCore.level15.Lesson12.Task10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Task10 {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {

        File file = new File(Statics.FILE_NAME);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader str = new BufferedReader(fr);
            String line;
            while ((line = str.readLine()) != null){
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
