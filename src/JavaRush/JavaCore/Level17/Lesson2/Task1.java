package JavaRush.JavaCore.Level17.Lesson2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class NoteThread extends Thread{
        @Override
        public void run() {
            for (int a = 0; a < 1000; a++){
                Note.addNote(getName() + "-Note" + a);
                try {
                    Thread.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }
                Note.removeNote(getName());
            }
        }
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }
}
