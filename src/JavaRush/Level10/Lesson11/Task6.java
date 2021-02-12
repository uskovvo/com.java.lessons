package JavaRush.Level10.Lesson11;

public class Task6 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int height;
        private String colorYes;
        private String size;

        public Human (String name){
            this.name = name;
        }

        public Human (int age){
            this.age = age;
        }

        public Human (boolean sex, String colorYes){
            this.sex = sex;
            this.colorYes = colorYes;
        }

        public Human (int height, String name){
            this.height = height;
        }

        public Human (String size, String colorYes){
            this.size = size;
            this.colorYes = colorYes;
        }

        public Human (int age, int height, String name){
            this.age = age;
            this.height = height;
            this.name = name;
        }
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, String colorYes, String size){
            this.name = name;
            this.colorYes = colorYes;
            this.size = size;
        }
        public Human (String size, boolean sex){
            this.size = size;
            this.sex = sex;
        }
        public Human (boolean sex){
            this.sex = sex;
        }
        public Human (){

        }// Напишите тут ваши переменные и конструкторы
    }
}
