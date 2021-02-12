package JavaRush.JavaCore.Level14.Lesson6;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" "+"Моя страна - "+Country.MOLDOVA+". "+"Я несу "+getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
