package JavaRush.JavaCore.Level13.Lesson6;

public class Task1 {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Edible, Eat{
        public void move(){

        }
        public void beEaten(){

        }
        public void eat(){

        }
    }

    public class Mouse implements Movable, Edible{
        public void move(){

        }
        public void beEaten(){

        }
    }

    public class Dog implements Movable, Eat{
        public void move(){

        }
        public void eat(){

        }
    }
}
