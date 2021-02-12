package JavaRush.Level9.Lesson2;

public class Task6 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] elm = Thread.currentThread().getStackTrace();
        System.out.println(elm[0].getClassName());
        System.out.println(elm[1].getClassName());
        System.out.println(elm[2].getClassName());//напишите тут ваш код
//        + ": " + elm[2].getMethodName() + ": " + text
    }
}
