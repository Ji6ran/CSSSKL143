/**
 * Created by Jibran on 4/23/19.
 */
public class Fraction {
    public final int numerator; // doesn't matter to make it private because we're using the keyword final, !changes.
    public final int denominator; // setting them as ints is fine because they're already a fraction, no need for decimals.

    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    public Fraction(int num, int denom) { // a constructor that doesn't take in args isn't defined because
                                          // the final instance variables aren't initialized, and if we were to
                                          // intialize it in the empty constructor, we wouldn't be able to anywhere else.

        int n = num;
        int d = denom;
        int largest = 0;
        int gcd = 1;
        // Simple invariant to check the largest value between the numerator and denominator.
        if (n > d) {
            largest = n;
        }
        else {
            largest = d;
        }
        /*
           using 2 as the least number you can divide by, and if the numerator has a remainder of 0 when
           going into "i" which is the largest value, and the denominator does as well, then that's your
           greatest common denominator. After that, make sure to check once more that if the greatest common divisor
           is not 0, then both the numerator and denominator are itself divided by the greatest common denominator
        */

        for (int i = largest; i >= 2; i--) {
            if (num % i == 0 && denom % i == 0) {
                gcd = i;
                break;
            }
        }

        if (gcd != 0) {
            num /= gcd;
            denom /= gcd;
        }
        this.numerator = num;
        this.denominator = denom;

    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public Fraction add(Fraction that) {
        int comDen = this.denominator * that.denominator;
        int newNom = (this.numerator * that.denominator) + (that.numerator * this.denominator);

        Fraction d = new Fraction(newNom, comDen);

        return d;
    }

    public int getNum() {
        return this.numerator;
    }

    public int getDenom() {
        return this.denominator;
    }

    public boolean equals(Object o) {
        if(o != null && ! (o instanceof Fraction)) { // if the object o is not null and it's not an instance of
                                                     // the fraction object, then return false.
            return false;
        }
        Fraction that = (Fraction)o;

        return (this.numerator == that.numerator) && (this.denominator == that.denominator);
    }
}
