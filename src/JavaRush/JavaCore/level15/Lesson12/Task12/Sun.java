package JavaRush.JavaCore.level15.Lesson12.Task12;

public class Sun implements Planet{
    private static Sun instance;
    private Sun(){}
    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
