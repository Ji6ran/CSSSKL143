/**
 * Created by Jibran on 6/4/19.
 */
public class Foo implements Runnable {
    private String string;

    public Foo(String string) {
        this.string = string;
    }

    public void run() {
        System.out.println(this.string);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Foo("name 1"));
        Thread t2 = new Thread(new Foo("name 2"));

        t1.start();
        t2.start();
    }
}
