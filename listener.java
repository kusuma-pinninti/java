import java.awt.*;    
import java.awt.event.*;    
 class key implements KeyListener {     
 Label l;    
    TextArea area;      
   key() {     
        Frame f=new Frame();  
        l.setBounds (20, 50, 100, 20);  
        f.add(l);    
        area = new TextArea();      
        area.setBounds (20, 80, 300, 300);    
        f.add(area);
        f.addKeyListener(this);    
        f.add(l);     
        f.setSize (400, 400);    
        f.setLayout (null);    
        f.setVisible (true);    
    }      
    public void keyPressed (KeyEvent e) {    
        l.setText ("Key Pressed");    
    }     
    public void keyReleased (KeyEvent e) {    
        l.setText ("Key Released");    
    }     
    public void keyTyped (KeyEvent e) {    
        l.setText ("Key Typed");    
    }      
    public static void main(String[] args) {    
        new key();    
    }    
}   