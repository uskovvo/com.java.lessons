package JavaRush.JavaCore.Level11.Lesson1.Test;

public class ThomasEdisonPhone extends AbstractPhone{
    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(long outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(long inputNumber) {
        System.out.println("Телефон звонит");
    }
}
