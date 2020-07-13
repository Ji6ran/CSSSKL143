/*
    1). What does it mean to be a date?:
        To be a date means that you have to have a month, day, and year, and those too as integers
        since you're not dealing with any decimal values.

    2). What can a date do?:
        A date can change its month, day, and year as time goes by, and it can tell you the date / season


*/
public class Date {
    // these variables are class-level variables
    private static int month;
    private static int day;
    private static int year;

    public static void main(String[] args) {
        setDate(04, 12, 2019);
        report();
    }

    public static void setDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public static void report() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
