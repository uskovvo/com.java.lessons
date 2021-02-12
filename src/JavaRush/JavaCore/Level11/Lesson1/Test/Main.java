package JavaRush.JavaCore.Level11.Lesson1.Test;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1882);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2010);
        User user = new User("Valera");
        user.callAnotherUser(995595668, firstPhone);


        user.callAnotherUser(963345121, phone);


        user.callAnotherUser(917252, videoPhone);
    }
}
