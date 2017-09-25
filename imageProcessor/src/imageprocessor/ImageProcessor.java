/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author MandoG
 */
public class ImageProcessor extends JFrame{
    JLabel label;
    JButton button;
    Book book1;
    boolean buttonOn = false;
    
    public ImageProcessor(){
        setLayout(new FlowLayout());
        
        book1 = new Book("Chubs", "Peanut", 2017, 20, "Hardcover");
        
        button = new JButton("Click");
        add(button);
        
        label = new JLabel("");
        add(label);
        
        ButtonEvent e = new ButtonEvent();
        button.addActionListener(e);
    }

    /**
     * @param args the command line arguments
     */
    public class ButtonEvent implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(!buttonOn){
                label.setText(book1.getTitle());
                buttonOn = true;
            } else {
                label.setText("");
                buttonOn = false;
            }
            
        }
}
  
    
    public static void main(String args[]) {
        // TODO code application logic here
        ImageProcessor gui = new ImageProcessor();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Chubby Chubs");
        gui.setSize(600, 300);
        gui.setVisible(true);
        
    }  
   
}
