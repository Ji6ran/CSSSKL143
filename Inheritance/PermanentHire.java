/**
 * Created by Jibran on 5/7/19.
 */
public class PermanentHire extends SalariedWorker {
    public static final double PERMANENTHIRE_MONTHLY = 6000;
    private double monthlyPay;

    public PermanentHire(String name, int social) {
        super(name, social, PERMANENTHIRE_MONTHLY);
        monthlyPay = PERMANENTHIRE_MONTHLY;
    }

    public PermanentHire(String name, int social, double monthlyPay) {
        super(name, social, monthlyPay);
        this.monthlyPay = monthlyPay;
    }

    public double calculateWeeklyPay() {
        return this.monthlyPay/4;
    }
}
