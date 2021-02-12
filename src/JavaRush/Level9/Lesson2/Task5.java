package JavaRush.Level9.Lesson2;

public class Task5 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] elm = Thread.currentThread().getStackTrace();
        System.out.println(elm.length);
        return elm.length;
    }
}
