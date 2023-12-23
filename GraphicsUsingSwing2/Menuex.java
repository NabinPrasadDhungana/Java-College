// WAP with a munu having three items. When an item is clicked, display its name in a Label.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menuex extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file;
    JMenuItem i1, i2, i3;
    JLabel label;

    public Menuex(){
        setSize(600,700);

        label = new JLabel();
        add(label);
        
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        
        file = new JMenu("File");
        mb.add(file);

        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        
        file.add(i1);
        file.add(i2);
        
        file.addSeparator();
        
        file.add(i3);

        label.setBounds(200,150,100,70);
        
        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu Demo");
    
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String i=e.getActionCommand();
        label.setText(i);
    }

    public static void main(String[] args) {
        new Menuex();
    }
}
