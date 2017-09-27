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
    JButton button01;
    JLabel label01;
    boolean click01 = false;
    
    public JavaApplication3(){
        setLayout(new FlowLayout());
        
        button01 = new JButton("Click Here");
        add(button01);
        
        label01 = new JLabel("");
        add(label01);
        
        ButtonEvent01 e1 = new ButtonEvent01();
        button01.addActionListener(e1);
    }
    
    /**
     * @param args the command line arguments
     */
    public class ButtonEvent01 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(!click01){
                label01.setText("Hello");
                click01 = true;
            } else {
                label01.setText("");
                click01 = false;
            }
            
        }
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication3 gui = new JavaApplication3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Practice Window");
        gui.setSize(600, 300);
        gui.setVisible(true);
    }
    
}
