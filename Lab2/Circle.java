public class Circle {
    private int x;
    private int y;
    private double radius;
    private String shape = "O";

    public Circle() {

    }

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public void draw() {
        System.out.println(this.shape);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (3.14 * (radius * radius));
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public String toString() {
        return this.shape;
    }

    public boolean equals(Circle that) {
        if (that.x == this.x && that.y == this.y && that.radius == this.radius) {
            return true;
        }
        else {
            return false;
        }
    }
}
