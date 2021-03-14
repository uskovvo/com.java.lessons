package JavaRush.JavaCore.Level16.Lesson3;

public class Task1 {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
