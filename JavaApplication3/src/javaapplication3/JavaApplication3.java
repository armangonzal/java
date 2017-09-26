/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author MandoG
 */
public class JavaApplication3 extends JFrame{
    JButton button1;
    JLabel label1;
    /**
     * @param args the command line arguments
     */
    public JavaApplication3(){
        setLayout(new FlowLayout());
        
        button1 = new JButton("Click");
        add(button1);
        
        label1 = new JLabel("");
        add(label1);
        
        ButtonEvent1 e = new ButtonEvent1();
        button1.addActionListener(e);  
    }
    
    public class ButtonEvent1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            label1.setText("Hey");
        }
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication3 gui = new JavaApplication3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Chub");
        gui.setSize(600, 300);
        gui.setVisible(true);
    }
    
}
