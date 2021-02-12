package JavaRush.Level10.Lesson11;

public class Task7 {
    public static  int A = 5;
    public static  int B = 5;
    public static  int C = 5;
    public static  int D = 5;

    public static void main(String[] args) {
        Task7 solution = new Task7();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Task7.D = 5 * D * C;

        Task7.D = 5;
    }

    public int getA() {
        return A;
    }
}
