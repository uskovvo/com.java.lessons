package JavaRush.JavaCore.Level12.Lesson12;

public class Task9 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Work implements Businessman{
        public void workHard(){

        }
    }

    public static class CTO extends Work implements Businessman{

    }
}
