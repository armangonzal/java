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
    JButton moveBtn;
    JLabel moveLabel;
    boolean click01 = false;
    boolean moveClick = false;
    Head head = new Head(4, true);
    Legs legs = new Legs(9, 4);
    Creature creature = new Creature(head, legs);
    //int[] meals = new int[10];
    int[] meals = {3,2,9,0,4,3,2,6,6,7};
    
    
    
    public JavaApplication3(){
        setLayout(new FlowLayout());
        
        button01 = new JButton("Speak");
        add(button01);
        
        label01 = new JLabel("");
        add(label01);
        
        moveBtn = new JButton("Move");
        add(moveBtn);
        
        moveLabel = new JLabel("");
        add(moveLabel);
        
        System.out.println(meals[4]);
        
        ButtonEvent01 e1 = new ButtonEvent01();
        button01.addActionListener(e1);
        
        MoveBtnEvent e2 = new MoveBtnEvent();
        moveBtn.addActionListener(e2);
    }
    
    /**
     * @param args the command line arguments
     */
    public class ButtonEvent01 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(!click01){
                label01.setText(creature.head.speak());
                click01 = true;
            } else {
                label01.setText("");
                click01 = false;
            }  
        }
    }
    
    public class MoveBtnEvent implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(!moveClick){
                moveLabel.setText("Creature is moving at speed of " + creature.legs.run());
                moveClick = true;
            } else {
                moveLabel.setText("");
                moveClick = false;
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
