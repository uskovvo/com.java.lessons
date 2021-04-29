package JavaRush.JavaCore.Level16.Lesson13;

public class Task6 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
//        System.out.println(Thread.getAllStackTraces().size());
    }

    public static class GenerateThread extends Thread{

        public GenerateThread(){
            super(String.valueOf(+
                    +createdThreadCount));
            start();
        }

        @Override
        public void run() {
            if (createdThreadCount < count){
//                new GenerateThread();
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return createdThreadCount + " created";
        }

    }
}
