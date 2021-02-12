package JavaRush.Level9.Lesson11;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);

                Thread.sleep(100);//напишите тут ваш код
            }
        }
        catch (Exception e){

        }
    }
}
