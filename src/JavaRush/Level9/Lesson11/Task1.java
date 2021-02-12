package JavaRush.Level9.Lesson11;

public class Task1 {
    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (Exception e){
            Throwable exception = e;
            exception.printStackTrace();
        }
        catch (Error e){
            Throwable error = e;
            error.printStackTrace();
        }
    }

    public static void divideByZero(){
        int a = 10 / 0;
        System.out.println(a);
    }
}
