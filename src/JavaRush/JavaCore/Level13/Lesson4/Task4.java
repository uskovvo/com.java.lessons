package JavaRush.JavaCore.Level13.Lesson4;

import java.awt.*;

public class Task4 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox{
        public Color BigFox() {
            return Color.GRAY;
        }

        @Override
        public Color getColor() {
            return null;
        }
    }
}
