package JavaRush.Level10.Lesson4;

public class Task3 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) ((byte)i + f);
        System.out.println(b);
    }
}
