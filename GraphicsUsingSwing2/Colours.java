/*Create a GUI application with 3 buttons representing different colors. When the button is pressed, 
change the background color of the frame to the corresponding color.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Colours extends JFrame implements ActionListener{
    
    JButton red, green, blue;

    Colours(){

        setSize(500,600);
        red= new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");

        add(red);
        add(green);
        add(blue);

        setLayout(new FlowLayout(10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==red){
            getContentPane().setBackground(Color.RED);
        }
        else if(e.getSource()==green){
            getContentPane().setBackground(Color.GREEN);
        }
        else{
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new Colours();
    }
}