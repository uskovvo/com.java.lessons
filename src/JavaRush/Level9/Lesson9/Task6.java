package JavaRush.Level9.Lesson9;

public class Task6 {
    public static void main(String[] args) {
    }

    static class MyException extends Exception{
    }

    static class MyException2 extends MyException {
    }

    static class MyException3 extends Error{
    }

    static class MyException4 extends MyException3{
    }
}
