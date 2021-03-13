package JavaRush.JavaCore.level15.Lesson12.Task12;

public class Earth implements Planet{
    private static Earth instance;
    private Earth(){}
    public static synchronized Earth getInstance(){
                if(instance == null){
                    instance =new Earth();

        }
        return instance;
    }
}
