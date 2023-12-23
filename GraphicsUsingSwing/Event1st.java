import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class Event1st extends JFrame implements ActionListener{
    JButton b;
    JTextField t;

    public Event1st(){
        setSize(400,600);
        
        b=new JButton("Click");
        t=new JTextField();
        
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(t);
        t.setColumns(10);
        
        add(b);
        
        b.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Font fn=new Font("Arial",Font.BOLD,30);
        t.setFont(fn);

        t.setBackground(Color.BLACK);
        t.setForeground(Color.RED);

        String text=t.getText();
        t.setText(text.toUpperCase());
    }

    public static void main(String[] args) {
        new Event1st();
    }
}
