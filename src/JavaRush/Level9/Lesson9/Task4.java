package JavaRush.Level9.Lesson9;

import java.io.IOException;
import java.rmi.RemoteException;

public class Task4 {
    public static void main(String[] args) {
        handleExceptions(new Task4());

    }

    public static void handleExceptions(Task4 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (NoSuchFieldException e){
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
