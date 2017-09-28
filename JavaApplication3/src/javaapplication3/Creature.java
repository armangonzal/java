/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author MandoG
 */
public class Creature {
    int intel;
    boolean awake;
    //Head myHead;

    public Creature(int intel, boolean awake) {
        this.intel = intel;
        this.awake = awake;
    }
    
    Head myHead = new Head(intel, awake);
            
    
    
    
    
    
}
