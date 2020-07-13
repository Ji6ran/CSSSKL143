/**
 * Created by Jibran on 5/7/19.
 */
public class ColorWithAlpha extends SimpleColor {
    private int alpha;

    public ColorWithAlpha(int alpha) {
        this.setR(0);
        this.setG(0);
        this.setB(0);
    }
    public ColorWithAlpha(int r, int g, int b, int a) {
        super(r, g, b); // this passes in whatever values are called in the constructor
                        // into the super's class constructor, but using the values passed into this constructor
        this.alpha = a;
    }
    public ColorWithAlpha(ColorWithAlpha other) {
        this.alpha = other.alpha;
    }

    public void setAlpha(int val) {
        if(val < 0 || val > 255) {
            throw new ColorException("Alpha cannot be less than 0 or greater than 255");
        }
        this.alpha = val;
    }

    public int getAlpha() {
        return this.alpha;
    }

    @Override
    public String toString() {
        return super.toString() + ", alpha: " + this.alpha;
        // this accomplishes using the parent's class toString() method call here
    }

    @Override
    public boolean equals(Object oth) {
        if(oth == null || !(oth instanceof ColorWithAlpha)) {
            return false;
        }
        ColorWithAlpha that = (ColorWithAlpha)oth;
        return (this.alpha == that.alpha);
    }
}
