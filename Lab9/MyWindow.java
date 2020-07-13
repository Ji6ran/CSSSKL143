import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by Jibran on 6/4/19.
 */
public class MyWindow extends JFrame implements MouseListener{

    ArrayList<Student> myShapes = new ArrayList<Student>();

    public MyWindow() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addMouseListener(this);
    }

    public void mouseExited(MouseEvent a) {

    }

    public void mouseReleased(MouseEvent a) {

    }

    public void mousePressed(MouseEvent a) {

    }

    public void mouseEntered(MouseEvent a) {

    }

    public void mouseClicked(MouseEvent a) {
        System.out.println();
        // I don't know what the instructions meant in this part of the lab.
    }
}
