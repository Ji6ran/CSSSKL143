public class PDriver {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(1);
        p.setY(9);

        System.out.println(p.toString());
        System.out.println(p.num);
        // System.out.println(p.y); Error is you're trying to access a private variable from another class
        // p.jebaited(); You get an error for trying to access a method that is private in another class
    }
}
