/**
 * Created by Jibran on 5/7/19.
 */
public class Consultant extends HourlyWorker {
    public static final double PAY = 3;
    private double newPay;

    public Consultant(String name, int social) {
        super(name, social, PAY);
        this.newPay = PAY;
    }

    public Consultant(String name, int social, int newPay) {
        super(name, social, newPay);
        this.newPay = newPay;
    }

    public double calculateWeeklyPay() {
        return (this.newPay / 4) * 20;
    }

}
