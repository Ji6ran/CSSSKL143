public class Car {
    private int odometer; // Class level variable
    private String make;    // Class level variable
    private String model;   // Class level variable
    private int year; // Class level variable

    public static void main(String[] args) {
        Car c = new Car("Toyota");
        System.out.println(c.toString());
        c.SecLevelsForVar();    // the addresses are the same for this because it references the memory
                                //location of the object at "this" instance when the Car class is used.
                                //On top of that, when you use toString method in a print statement, it
                                //prints the memory address unless it's overridden.

        //velocity = 80;  testing to make sure you can't access methods outside of its method definition

        // int x, y, x2, y2 are all class-level variables. Examples of 2 local variables would be
        // in the constructor that takes in 2 parameters, newX and newY which are local variables
    }

    public Car(String m) {
        this.make = m; // m is a local variable
    }

    public Car(String ma, String mo) {
        this.make = ma;
        this.model = mo; // mo and ma are local variables
    }

    public void SecLevelsForVar() {
        int velocity = 60; // speed is a local variable
        make = "Lamborghini";
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return make + " " + model + ": " + odometer;
    }
}
