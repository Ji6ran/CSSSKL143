import java.awt.*;
public class Shape {
    // 4 class invariants would be: Non-negative numbers, not bigger than 15,
    // cannot input strings for numbers and cannot be decimals.

    private int x;
    private int y;
    private Color color;

    public Shape() {
        this.x = 1;
        this.y = 1;
        this.color = new Color(64, 64, 64);
    }

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape other) {
        this.x = other.x;
        this.y = other.y;
        this.color = other.color;
    }

    @Override
    public String toString() {
        return "Color: " + this.color + " | X: " + this.x + " | Y: " + this.y;
    }

    public double getArea() {
        return -1;
    }

    public void draw(Graphics g) {

    }
}
