import javax.swing.*;
class Graphics
{
    public Graphics()
    {
        JFrame f=new JFrame("Graphics");
        f.setSize(500,600);

        JTextField t=new JTextField();
        t.setBounds(150,100,300,70);
        
        JButton b=new JButton("OK");
        b.setBounds(200,250,100,70);

        f.add(t);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args)
    {
        new Graphics();
    }
}