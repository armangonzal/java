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

public class Head {
    int intel;
    boolean awake;

    public Head(int intel, boolean awake) {
        this.intel = intel;
        this.awake = awake;
    }
    
    public String speak(){
        if(awake && intel > 4){
            System.out.println("I can talk.");
            return "I can talk";
        } else if (awake && intel < 5){
            return "Grrr";
        } else {
            System.out.println("Zzzzz");
            return "Zzzzz";
        }
    }

    public int getIntel() {
        return intel;
    }

    public boolean isAwake() {
        return awake;
    }
    
    
    
}
