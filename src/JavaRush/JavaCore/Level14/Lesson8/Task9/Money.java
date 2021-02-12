package JavaRush.JavaCore.Level14.Lesson8.Task9;

public abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public abstract String getCurrencyName();

}
