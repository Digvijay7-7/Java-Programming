//change logic from factorial to prime

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
class factorialappl extends Applet implements ActionListener{
JButton b1;
JTextField t1;
JLabel lb1, lb3;
JFrame f;
factorialappl(){
f = new JFrame("Factorial of Number using Applet");
lb1 = new JLabel("Enter a Number :");
lb1.setBounds(110, 50, 150, 30);
f.add(lb1);
t1 = new JTextField();
t1.setBounds(220, 50, 150, 30);
f.add(t1);
lb3 = new JLabel("Result :");
lb3.setBounds(110, 90, 150, 30);
f.add(lb3);
b1 = new JButton("Find ");
b1.setBounds(110, 130, 100, 30);
f.add(b1);
b1.addActionListener(this);
f.setLayout(null);
f.setSize(500,250);
f.setVisible(true);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
int n = Integer.parseInt(t1.getText());
int f = 1;
if (e.getSource().equals(b1)){
for (int i = 1; i <= n; i++){
f = f * i;
}
lb3.setText(String.valueOf("Result : " + f));
}
}
public static void main(String args[]){
factorialappl t = new factorialappl();
}
}
<html> 
<body bgcolor="000000"> 
<center>
<applet code = "factorialappl.class" width = "500" height = "300" >
</applet>
</center> 
</body>
</html>