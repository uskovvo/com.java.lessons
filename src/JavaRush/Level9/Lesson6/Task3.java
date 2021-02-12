package JavaRush.Level9.Lesson6;

public class Task3 {
    public static void main(String[] args) {
        try {//напишите тут ваш код

            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
