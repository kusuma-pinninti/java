import java.awt.*;
import java.awt.event.*;
class button implements ActionListener
{
TextField tf;
button()
{
Frame f=new Frame("button");
Button b=new Button("Click here ");
b.addActionListener(this);
tf=new TextField();
tf.setBounds(50,50,150,150);
b.setBounds(90,90,200,200);
f.setLayout(new FlowLayout());
f.setSize(400,400);
f.setVisible(true);
f.add(tf);
f.add(b);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("Welcome");
}
public static void main(String args[])
{
button b=new button();
}
}