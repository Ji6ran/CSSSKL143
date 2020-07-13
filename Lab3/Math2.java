/**
 * Created by Jibran on 4/23/19.
 */
public class Math2 {
    public static final double PI = 3.14159; // making them public and because they're final they won't be able
    public static final double E = 2.71828;  // to be changed

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else if (a < b) {
            return b;
        }
        else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else if (a < b) {
            return b;
        }
        else {
            return b;
        }
    }

    public static int pow(int base, int exp) {
        int r = 1;
        for (int i = 1; i <= exp; i++) {
            r *= base;
        }
        return r;
    }
}
