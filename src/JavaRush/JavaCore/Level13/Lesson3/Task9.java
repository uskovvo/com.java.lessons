package JavaRush.JavaCore.Level13.Lesson3;

public class Task9 {
    public interface CanMove{
        Double speed ();

    }

    public interface CanFly extends CanMove{
        Double speed(CanFly a);
    }
}
