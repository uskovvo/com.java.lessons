package JavaRush.JavaCore.Level14.Lesson8.Task3;

import JavaRush.JavaCore.Level11.Lesson1.Test.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true)//тут цикл по чтению ключей, пункт 1
        {
            key = reader.readLine();
            if (key.equals("user")){
                person = new Person.User();//создаем объект, пункт 2
            }else if(key.equals("loser")){
                person = new Person.Loser();
            }else if(key.equals("coder")){
                person = new Person.Coder();
            }else if(key.equals("proger")){
                person = new Person.Proger();
            }else break;

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();// пункт 3
        }else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
