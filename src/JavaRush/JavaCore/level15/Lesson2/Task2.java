package JavaRush.JavaCore.level15.Lesson2;

public class Task2 {
    public static class Goose extends SmallAnimal{
        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }//добавьте классы Goose и Dragon тут

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Goose goose = new Goose();
        System.out.println(dragon.getSize());
        System.out.println(goose.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
