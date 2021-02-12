package JavaRush.JavaCore.Level14.Lesson8.Task1;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }//add println method here
}
