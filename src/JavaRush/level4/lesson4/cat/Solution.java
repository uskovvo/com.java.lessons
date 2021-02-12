package JavaRush.level4.lesson4.cat;

public class Solution {

    public static void main(String[] args) {
        Man valera = new Man("Valera", 33, "SPb");
        Man alex = new Man ("Alexader", 35, "SPb");
        Woman alyna = new Woman ("Alyna", 6, "SPb");
        Woman lyliya = new Woman ("Lyliya", 0, "SPb");

        System.out.println(valera.name + " " + valera.age + " " + valera.address);
        System.out.println(alex.name + " " + alex.age + " " + alex.address);
        System.out.println(alyna.name + " " + alyna.age + " " + alyna.address);
        System.out.println(lyliya.name + " " + lyliya.age + " " + lyliya.address);
    }

    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
            public String name;
            public int age;
            public String address;

            public Woman(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
        }
    }

