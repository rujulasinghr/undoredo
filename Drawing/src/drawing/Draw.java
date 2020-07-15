
package drawing;


import javax.swing.JFrame;
import java.awt.event.ItemEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Draw
{ 
    public static void main(String[] args)
    {
        
         DrawFrame panel = new DrawFrame();
         panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         panel.setVisible(true);
    }   
}
