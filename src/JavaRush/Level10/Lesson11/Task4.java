package JavaRush.Level10.Lesson11;

public class Task4 {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        StringBuffer str = new StringBuffer(text);
        for (int a = 0; a < 40; a++){
            System.out.println(str);
            str.deleteCharAt(0);//напишите тут ваш код
        }
    }
}
