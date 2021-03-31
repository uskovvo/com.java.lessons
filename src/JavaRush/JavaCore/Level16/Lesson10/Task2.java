package JavaRush.JavaCore.Level16.Lesson10;

public class Task2 {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();//add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            Thread currentThread = Thread.currentThread();
            try{
                while (!currentThread.isInterrupted()){
                    System.out.println(numSeconds);
                    numSeconds--;
                    Thread.sleep(1000);
                    if (numSeconds == 0){
                        System.out.println("Марш!");
                        break;
                    }
                }
            }catch (InterruptedException e){
                System.out.println("Прервано!");
            }
        }
    }
}
