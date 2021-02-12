package JavaRush.JavaCore.Level11.Lesson1.Test;

public class Phone extends AbstractPhone{
    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(long outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(long inputNumber) {
        System.out.println("Телефон звонит");
    }
}
