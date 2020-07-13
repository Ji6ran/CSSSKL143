import java.awt.*;

/**
 * Created by Jibran on 5/7/19.
 */
public class Square extends Shape {
    private int x;
    private int y;
    private int height;
    private int width;

    public Square(int x, int y) {
        super(x, y);
        height = 100;
        width = 100;
    }

    public double getArea() {
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(Color.CYAN); // setting color
        for(int i = 0; i < 20; i++) {
            g2d.draw3DRect(10, 10, height, width, false); //drawing square using x y and height width, no raising
        }
    }

    /*public Shape test() {
        Shape retVal = null;
        retVal = new Square(3, 9);
        return retVal;
    }*/
}
