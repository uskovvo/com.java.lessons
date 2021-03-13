package JavaRush.JavaCore.level15.Lesson12.Task12;

public class Moon implements Planet{
    private static Moon instance;
    private Moon(){}
    public static synchronized Moon getInstance(){
                if(instance == null){
                    instance =new Moon();
        }
        return instance;
    }
}
