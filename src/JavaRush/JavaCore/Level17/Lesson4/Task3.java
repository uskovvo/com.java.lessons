package JavaRush.JavaCore.Level17.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit(int index, String fruit){
            fruits.add(0, fruit);
        }

        public synchronized void removeFruit(int index){
            fruits.remove(index);
        }

        public synchronized  void addVegetables(int index, String vegetable){
            vegetables.add(0, vegetable);
        }

        public synchronized  void removeVegetables(int index){
            vegetables.remove(index);
        }

        }
}
