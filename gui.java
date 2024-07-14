import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.event.ActionEvent.*;
class gui
{
public static void main(String args[])
{
abc obj=new abc();
obj.setVisible(true);
obj.setSize(400,400);
obj.setLayout(new FlowLayout());
}
}
class abc extends JFrame
{
JTextField t1;
JTextField t2;
JButton b;
JLabel l;
public abc()
{

l=new JLabel("result");
add(l);
t1=new JTextField();
t2=new JTextField();
add(t1);
add(t2);
b=new JButton();
add(b);
ActionListener al=new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
int num1=Integer.parseInt(t1.getText());
int num2=Integer.parseInt(t2.getText());
int value =num1+num2;
l.setText(value+"");
}
};
b.addActionListener(al);
}
}