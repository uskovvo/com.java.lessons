package JavaRush.Level9.Lesson2;

public class Task1 {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element;//напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] element1 = Thread.currentThread().getStackTrace();
        return element1;//напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] element2 = Thread.currentThread().getStackTrace();
        return element2;//напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] element3 = Thread.currentThread().getStackTrace();
        return element3;//напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] element4 = Thread.currentThread().getStackTrace();
        return element4;//напишите тут ваш код
    }
}
