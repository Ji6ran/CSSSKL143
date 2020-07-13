import java.awt.*;

/**
 * Created by Jibran on 4/23/19.
 */
public class LineSegment {
    // privacy leak is basically a method, class, or variable that is immutable (anyone can do what they want with it)
    // getters don't have privacy leaks but setters can (e.g. getting your account balance versus setting it to $100000.
    // methods, classes, and variables.

    private Point2D start;
    private Point2D end;

    public LineSegment() {
        this.start = new Point2D();
        this.end = new Point2D();
    }

    public LineSegment(LineSegment other) {
        this.start = other.start;
        this.end = other.end;
    }

    public LineSegment(Point2D start, Point2D end) {
        if(start == null || end == null) {
            start = new Point2D();
            end = new Point2D();
        }
        else {
            this.start = start;
            this.end = end;
        }
    }

    public Point2D getStartPoint() {
        return this.start;
    }

    public Point2D getEndPoint() {
        return this.end;
    }

    public void setStartPoint(Point2D start) {
        if(start == null) {
            return;
        }
        this.start = start;
    }

    public void setEndPoint(Point2D end) {
        if(end == null) {
            return;
        }
        this.end = end;
    }

    public String toString() {
        return "Line start: " + this.start + " and Line end: " + this.end;
    }

    public boolean equals(Object other) {
        if(other == null || !(other instanceof LineSegment)) {
            return false;
        }
        LineSegment that = (LineSegment)other;
        return (this.start == that.start) && (this.end == that.end);
    }

    public double distance() {
        double d, x, y, sum;
        x = Math.pow(end.getX() - start.getX(), 2);
        y = Math.pow(end.getY() - start.getY(), 2);
        sum = x + y;
        d = Math.sqrt(sum);

        return d;
    }
}
