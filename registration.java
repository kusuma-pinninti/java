import javax.swing.*;
import java.awt.*;
class week12b{
JFrame j=new JFrame("Sample resgistration page");
week12b(){
JLabel nam=new JLabel(" Name ");
JTextField name=new JTextField(12);
JLabel unam=new JLabel(" User name");
JTextField uname=new JTextField(12);
JLabel pass=new JLabel(" Password ");
JPasswordField pwd=new JPasswordField(12);
ButtonGroup b=new ButtonGroup();
JRadioButton male=new JRadioButton("Male");
JRadioButton female=new JRadioButton("Female");
b.add(male);
b.add(female);
JCheckBox cb=new JCheckBox("I Agree Terms and conditions");
//JLabel d=new JLabel();
JButton res=new JButton("Register");
j.add(nam);
j.add(name);
j.add(unam);
j.add(uname);
j.add(pass);
j.add(pwd);
j.add(male);
j.add(female);
j.add(cb);
//j.add(d);
j.add(res);
j.setLayout(new GridLayout(7,2));
j.setSize(400, 200);
j.setVisible(true);
j.setDefaultCloseOperation(3);
}
public static void main(String[] args) {
new week12b();
}
}