package JavaRush.level4.lesson4.cat;

public class Rectangle {
    public int top;
    public int left;
    public int width;
    public int height = width;

    public Rectangle (int top) {
        this.top = top;
    }

    public Rectangle (int top, int left){
        this.top = top;
        this.left = left;
    }

    public Rectangle (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public Rectangle (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
}

