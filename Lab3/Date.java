import java.awt.Color;

public class Date {
    /*
       1). these variables are class-level variables
           difference between public and private access modifiers is other classes, when created
           an instance of, will not be able to access the instance variables directly, and can only
           access it with getters/setters

       2a). They can be accessed/read
       2b). You can as long as it's doing it from a static method
       2c). Only 1.

       3a). It can be accessed, used, and read.
       3b). No you cannot re-initialize it after the first initialization.
       3c). It'd be okay because they cannot change the value of a final variable.

    */
    private int month;
    private int day;
    private int year;

    public Date() {
        month = 1;
        day = 1;
        year = 2000;
    }

    public Date(int m, int d, int y) {
        setDate(m, d, y);
        // difference between doing month = m and using the setDate method is that setDate
        // enforces invariants.
    }

    public Date(Date d) {
        this.month = d.month;
        this.day = d.day;
        this.year = d.year;


    }

    public void setDate(int m, int d, int y) {
        if(m < 1 || m > 12) {
            System.out.println("Can't set invalid month");
            return;
        }
        if(d < 1 || d > 31) {
            System.out.println("Can't set invalid day");
            return;
        }
        if(y < 0) {
            System.out.println("Can't set invalid year");
            return;
        }
        this.month = m;
        this.day = d;
        this.year = y;
    }

    @Override
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    public boolean equals(Object oth) {
        if(oth == null) {
            return false;
        }

        if(!(oth instanceof Date)) {
            return false;
        }
        Date that = (Date)oth;
        return (this.month == that.month) && (this.day == that.day) && (this.year == that.year);
    }
}