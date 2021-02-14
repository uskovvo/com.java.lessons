package JavaRush.JavaCore.Level14.Lesson8.Task14;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance =new Singleton();
        }
        return instance;
    }
}
