package JavaRush.JavaCore.Level12.Lesson12;

public class Lesson8 {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Miner, Secretary, Worker, Businessman{

        public void workVeryHard() {

        }

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
