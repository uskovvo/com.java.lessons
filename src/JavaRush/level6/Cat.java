package JavaRush.level6;

public class Cat {
    public static int catCount = 0;

    public Cat (){
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable{
        catCount--;
    }

    public static void main(String[] args) {

    }
}
