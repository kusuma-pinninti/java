import java.awt.*;    
import javax.swing.*;    
    
class GridLayoutExample  
{   
      
GridLayoutExample()  
{
   JFrame frameObj = new JFrame();    
    JButton b1 = new JButton("1");    
    JButton b2 = new JButton("2");    
    JButton b3 = new JButton("3");    
    JButton b4 = new JButton("4");    
    JButton b5 = new JButton("5");  
    JButton b6 = new JButton("6");    
    JButton b7 = new JButton("7");    
    JButton b8 = new JButton("8");    
    JButton b9 = new JButton("9");    
    JButton b10 = new JButton("10");  
    JButton b11 = new JButton("11");        
    frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);      
    frameObj.add(b5); frameObj.add(b6);  frameObj.add(b7); 
 frameObj.add(b8);    
    frameObj.add(b9); 
// frameObj.add(b10);
//frameObj.add(b11);      
    frameObj.setLayout(new GridLayout(3,3));    
    frameObj.setSize(300, 300);    
    frameObj.setVisible(true);   
    frameObj.setDefaultCloseOperation(3); 
}    
   
public static void main(String argvs[])   
{    
    new GridLayoutExample();    
}    
}    