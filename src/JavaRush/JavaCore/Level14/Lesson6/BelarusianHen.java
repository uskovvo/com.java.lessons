package JavaRush.JavaCore.Level14.Lesson6;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 110;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" "+"Моя страна - "+Country.BELARUS+". "+"Я несу "+getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
