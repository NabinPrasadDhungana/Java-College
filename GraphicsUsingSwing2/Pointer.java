import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pointer implements MouseListener,MouseMotionListener {
    JTextField t1,t2;
    JFrame f;

    public Pointer(){
        f=new JFrame();

        t1 = new JTextField();
        t2 = new JTextField();

        t1.setColumns(10);
        t2.setColumns(10);

        t1.setEditable(false);
        t2.setEditable(false);
        f.add(t1);
        f.add(t2);

        f.setLayout(new FlowLayout());
        f.setSize(600,700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Mouse Event Listener");

        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e){
        t1.setText("In");
    }

    public void mouseExited(MouseEvent e){
        t1.setText("Out");
    }

    public void mouseMoved(MouseEvent e){
        t2.setText("X: "+e.getX()+" and Y: "+e.getY());
    }

    public static void main(String[] args) {
        new Pointer();
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
}
