import javax.swing.*;
import java.awt.*;
public class Grid extends JFrame{
    public Grid(){
        setSize(1000, 1000);
        JButton [] btn=new JButton[6];

        for(int i=0;i<btn.length;i++){
            btn[i]=new JButton(""+(i+1));
            add(btn[i]);
        }

        setLayout(new GridLayout(2,3));
        setVisible(true);
    }
    public static void main(String[] args) {
        new Grid();
    }
}
