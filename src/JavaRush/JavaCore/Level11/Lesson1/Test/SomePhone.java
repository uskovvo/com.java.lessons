package JavaRush.JavaCore.Level11.Lesson1.Test;

public class SomePhone {

    private int year;
    private String company;

    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }

    private void openConnection(){



    }

    public void call(){
        openConnection();
        System.out.println("Вызываю номер");
    }
    public void ring(){
        System.out.println("Дрииинь - дриииииииинь");
    }
}
