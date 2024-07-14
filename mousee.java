import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class mousee
{
public static void main(String args[])
{
abc obj=new abc();
}
}
class abc 
{
public abc()
{
JFrame f=new JFrame("hi");
f.setVisible(true);
f.setSize(400,400);
f.setLayout(new FlowLayout());
f.addMouseListener(new MouseAdapter()
{
public void mousePressed(MouseEvent e)
{
int x=e.getX();
int y=e.getY();
System.out.println(x+","+y);
}
});
}
}