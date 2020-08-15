import java.awt.*;
public class SimpleExample extends Frame{
    SimpleExample(){  
        Button b=new Button("Button!!"); 
        
        b.setBounds(50,50,50,50);  
        
        add(b); 
        
        setSize(500,300); 
        
        setTitle("This is my First AWT example"); 
        
        setLayout(new FlowLayout());
        
        setVisible(true);  
    }  
    public static void main(String args[]){  
         SimpleExample fr=new SimpleExample();  
    }
}