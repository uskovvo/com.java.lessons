package JavaRush.JavaCore.Level14.Lesson8.Task9;

public class Ruble extends Money{

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 5;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
