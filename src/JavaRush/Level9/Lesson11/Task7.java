package JavaRush.Level9.Lesson11;

public class Task7 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Task7 solution = new Task7();
        solution.A = 5;

        Task7.D = 5;
    }

    public int getA() {
        return A;
    }
}
