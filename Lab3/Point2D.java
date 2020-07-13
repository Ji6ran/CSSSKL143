public class Point2D {

    private int x;
    private int y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void resetToOrigin() {
        this.x = 0;
        this.y = 0;
    }

    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof Point2D)) {
            return false;
        }

        Point2D that = (Point2D)o;
        return (this.x == that.x && this.y == that.y);
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(3);
        a.setY(5);
        System.out.println("Point: (" + a.getX() + "," + a.getY() + ")");
        a.translate(-1, 1);
        System.out.println("Point: (" + a.getX() + "," + a.getY() + ")");
        a.resetToOrigin();
        System.out.println("Point: (" + a.getX() + "," + a.getY() + ")");

        Point2D b = new Point2D();
        Point2D c = new Point2D();

        System.out.println(b.toString());
        System.out.println(c); // toString not needed because of override
        System.out.println("b and c equal?: " + b.equals(c));
    }
}
