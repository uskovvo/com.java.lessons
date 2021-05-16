package JavaRush.JavaCore.Level18.Lesson8.Task4;

import java.io.FileInputStream;
import java.io.IOException;

public class TxtInputStream extends FileInputStream {

    public TxtInputStream (String fileName) throws IOException, UnsupportedFileNameException{
        super(fileName);
        if (!fileName.endsWith(".txt")){
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {

    }
}
