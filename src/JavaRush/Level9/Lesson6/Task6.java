package JavaRush.Level9.Lesson6;

public class Task6 {
    public static void main(String[] args) {
        try {//напишите тут ваш код

            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
