package JavaRush.level6;

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        for (int b = 1; b <= 5; b++){
            result += text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int b = 1; b <= count; b++){
            result = result + text;//напишите тут ваш код
        }
        return result;
    }

    public static void main(String[] args) {
        StringHelper.multiply("String");
        StringHelper.multiply("Hi", 4);
    }
}
