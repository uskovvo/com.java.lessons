package JavaRush.JavaCore.Level14.Lesson8.Task9;

public class USD extends Money{
    public USD(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 100;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
