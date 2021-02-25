package JavaRush.JavaCore.level15.Lesson9;

import JavaRush.JavaCore.level15.Lesson2.Task3.Solution;

public class Task3 {

    public int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;

    @Override
    public String toString() {
        return "Task3{" +
                "intVar=" + intVar +
                ", doubleVar=" + doubleVar +
                ", DoubleVar=" + DoubleVar +
                ", booleanVar=" + booleanVar +
                ", ObjectVar=" + ObjectVar +
                ", ExceptionVar=" + ExceptionVar +
                ", StringVar='" + StringVar + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Task3 task = new Task3();
        System.out.println(task.toString());
    }
}
