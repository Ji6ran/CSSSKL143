public class Square {
    private int x;
    private int y;
    private double sideLength;
    private String shape = "[]";

    /*
        1). We do so much copying-and-pasting in our software because not only do a lot of the
            concepts correlate with each other, but it's also the fact that it's good practice of
            seeing the same thing repeated, which can help us remember it easier. It can be problematic
            because copying-and-pasting code doesn't always end up with error-free stuff and can be hectic,
            especially because you sometimes cannot find the problem right away if there's an error.

        2). There's obvious improvements that can be made as far as the drawing goes, and most likely
            the other things too.

        3). I was familiar with reptition and sequence, but had to look up the 3rd one being selection.

        4). It would complicate it by having us account for multiple shapes, such as trapezoids, triangles,
            hexagons, etc. whereas with one unifying object array we can have whichever shape we want as they
            all are described by the same underlying word - object.

     */


    public Square() {

    }

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Square(int x, int y, double sl) {
        this.x = x;
        this.y = y;
        this.sideLength = sl;
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

    public double getSideLength() {
        return this.sideLength;
    }

    public int getArea() {
        return (this.x * this.y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.shape;
    }

    public boolean equals(Square that) {
        if ((that.x == this.x) && (that.y == this.y) && (that.sideLength == this.sideLength)) {
            return true;
        }
        else {
            return false;
        }
    }
}
