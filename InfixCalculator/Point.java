public class Point {
    private int x;
    private int y;
    public int num;

    public Point() {
        x = 0;
        y = 0;
        num = 10;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    private void jebaited() {
        System.out.println("Example that you cannot access private methods outside of this class");
    }
}
