public class SquareNum {
    public static void main(String[] args) {
        System.out.println(square(3));
        System.out.println(square(5.0));
        System.out.println(square((float)9.00));
    }

    public static int square(int num) {
        System.out.println("This is a num with data type int");
        return num * num;
    }

    public static double square(double num) {
        System.out.println("This is a num with data type double");
        return num * num;
    }

    public static float square(float num) {
        System.out.println("This is a num with data type float");
        return num * num;
    }
}
