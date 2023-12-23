// Create a gui application with three text fields and two buttons (Plus and minus). When plus button is clicked,
// perform addition of two values of the 1st two text fields and display it on the third and display difference if
// minus is pressed.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Math extends JFrame implements ActionListener{
    JTextField t1, t2, ans;
    JButton plus, minus;

    public Math(){
        setSize(1000,1000);

        t1 = new JTextField();
        t2 = new JTextField();
        ans = new JTextField();
        ans.setEditable(false);

        t1.setColumns(10);
        t2.setColumns(10);
        ans.setColumns(10);

        plus = new JButton("+");
        minus = new JButton("-");

        add(t1);
        add(t2);
        add(ans);
        add(plus);
        add(minus);

        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        plus.addActionListener(this);
        minus.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());

        if(e.getSource()==plus){
            ans.setText(""+(num1+num2));
        }
        else{
            ans.setText(""+ (num1 - num2));
        }
    }

    public static void main(String[] args) {
        new Math();
    }
}
