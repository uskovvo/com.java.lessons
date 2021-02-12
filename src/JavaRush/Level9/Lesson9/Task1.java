package JavaRush.Level9.Lesson9;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Task1 {
    public static void main(String[] args) throws Exception {
        try {//напишите тут ваш код

            method1();
        }
        catch (NullPointerException e){

        }
        catch (FileNotFoundException e){

        }
        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
