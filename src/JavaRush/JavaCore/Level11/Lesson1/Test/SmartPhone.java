package JavaRush.JavaCore.Level11.Lesson1.Test;

public class SmartPhone extends CellPhone{
    private String operationSystem;

    public SmartPhone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void install(String program){
        System.out.println("Устанавливаю " + program + " для " + operationSystem);
    }
}
