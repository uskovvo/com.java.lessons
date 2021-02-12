package JavaRush.level4.lesson4;

public class TablicaUmnogeniya {
    public static void main(String[] args) {
        int a=1;
        int b;
        while (a<=10){
            b=1;
            while(b<=10){
                System.out.print(a*b+" ");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
