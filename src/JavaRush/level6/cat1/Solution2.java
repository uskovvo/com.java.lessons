package JavaRush.level6.cat1;

public class Solution2 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription(){
            return "get";
        }
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}
