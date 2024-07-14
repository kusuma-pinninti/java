import javax.swing.*;    

 class ListExample  
{  
     ListExample(){  
        JFrame f= new JFrame();  
         String a[]={"hii","hello","wel","come"};
          JList <String> list = new JList <String>(a);  
          list.setBounds(100,100, 75,75);  
          f.add(list);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
   new ListExample();
      
        
}} 