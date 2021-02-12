package JavaRush.JavaCore.Level13.lesson11;

import java.awt.*;

public class Task9 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox() {
            @Override
            public Color getColor() {
                return null;
            }
        };
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

    public abstract static class BigFox extends Fox{

    }
}
