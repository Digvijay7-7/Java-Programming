import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class colorch extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    public colorch()
    {
        setTitle("color change");
        b1=new JButton("PINK");
        b2=new JButton("CYAN");
        b3=new JButton("GREEN");
        setSize(400,400);
        setLayout(null);
        b1.setBounds(30,100,80,30);
        b2.setBounds(130,100,80,30);
        b3.setBounds(230,100,80,30);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            getContentPane().setBackground(Color.PINK);
        }
        else if(e.getSource()==b2)
        {
            getContentPane().setBackground(Color.CYAN);
        }
        else
        {
            getContentPane().setBackground(Color.GREEN);
        }
    }
    public static void main(String args[])
    {
        colorch r=new colorch();
    }
}



