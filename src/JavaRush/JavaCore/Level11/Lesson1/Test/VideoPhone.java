package JavaRush.JavaCore.Level11.Lesson1.Test;

public class VideoPhone extends AbstractPhone{
    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(long outputNumber) {
        System.out.println("Подключаю видеоканал для абонента " + outputNumber);
    }

    @Override
    public void ring(long inputNumber) {
        System.out.println("У вас входящий видеозвонок... " + inputNumber);
    }
}
