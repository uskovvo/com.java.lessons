package JavaRush.JavaCore.Level16.Lesson10;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.isClockRun = false;
    }

    public static class TestThread implements Runnable {
        public static boolean isClockRun = true;
        public void run() {
            while (isClockRun) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                    if (!isClockRun){
                        return;
                    }
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
