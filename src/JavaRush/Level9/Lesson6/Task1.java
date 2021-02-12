package JavaRush.Level9.Lesson6;

public class Task1 {
    public static void main(String[] args) {
        try {//напишите тут ваш код

            int a = 42 / 0;
        }

        catch(ArithmeticException e){
            System.out.println(e);//напишите тут ваш код
        }
    }
}
