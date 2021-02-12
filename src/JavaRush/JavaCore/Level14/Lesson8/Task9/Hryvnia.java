package JavaRush.JavaCore.Level14.Lesson8.Task9;

public class Hryvnia extends Money{
    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 10;
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
