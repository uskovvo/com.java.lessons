package JavaRush.level6;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(a);
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(Util.getDistance(2,4,5,9));
    }
}
