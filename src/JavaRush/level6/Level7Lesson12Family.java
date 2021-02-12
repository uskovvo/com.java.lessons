package JavaRush.level6;

public class Level7Lesson12Family {
    public static void main(String[] args) {
        Human grandPa1 = new Human("Олег", true, 55);
        Human grandPa2 = new Human("Расим", true, 64);
        Human grandMa1 = new Human("Ольга", false, 54);
        Human grandMa2 = new Human("Равия", false, 64);
        Human father = new Human("Валера", true, 33, grandPa1, grandMa1);
        Human mother = new Human("Эльвира", false, 35, grandPa2, grandMa2);
        Human daughter = new Human("Алина", false, 6, father, mother);
        Human daughter1 = new Human("Лиля", false, 0, father, mother);
        Human son = new Human("Дима", true, 2, father, mother);
        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
        System.out.println(daughter1);
        System.out.println(son);// напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }// напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
