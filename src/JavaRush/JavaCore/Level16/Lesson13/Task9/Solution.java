package JavaRush.JavaCore.Level16.Lesson13.Task9;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countIndexUp = 1;

        public void run(){
            try {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + ": " + countIndexUp);
                    countIndexUp += 1;
                    if (countIndexUp == number + 1)
                        return;
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
            }
        }
        //Add your code here - добавь код тут
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
                return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
