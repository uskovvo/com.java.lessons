package JavaRush.JavaCore.Level14.Lesson6;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" "+"Моя страна - "+Country.RUSSIA+". "+"Я несу "+getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
