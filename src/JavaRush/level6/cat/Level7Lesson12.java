package JavaRush.level6.cat;

public class Level7Lesson12 {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            } ;//напишите тут ваш код
        }
        System.out.println("Бум!");
    }
}
