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
    Novel novel1;
    AcClarkeBook acBook1;
    boolean buttonOn = false;
    
    public ImageProcessor(){
        setLayout(new FlowLayout());
        
        book1 = new Book("Chubs", "Peanut", 2017, 20, "Hardcover");
        novel1 = new Novel("The Important", "Ziggy", 2017, 100, "PaperBack", 5, 
                "Nonfiction");
        acBook1 = new AcClarkeBook("Childhood's end", 2001, 200, "PaperBack", 15, 
                "Child Series");
        
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
                label.setText("\""+acBook1.getTitle() + "\"" + " by " 
                        + acBook1.getAuthor() + " in the series: " + acBook1.getSeries());
                buttonOn = true;
            } else {
                label.setText("");
                buttonOn = false;
            }
            
        }
}
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        ImageProcessor gui = new ImageProcessor();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Chubby Chubs");
        gui.setSize(600, 300);
        gui.setVisible(true);
        
    }  
   
}
