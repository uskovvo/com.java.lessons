package JavaRush.JavaCore.Level11.Lesson1.Test;

public abstract class WirelessPhone extends AbstractPhone{

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
