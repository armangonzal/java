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
public class Legs {
    private int number;
    private int speed;

    public Legs(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }
    
    public void incrSpeed(){
        this.speed+=1;
    }
    
    public int run(){
        //System.out.println("The creature is running at " + speed);
        return speed;
    }

    public int getNumber() {
        return number;
    }

    public int getSpeed() {
        return speed;
    }

    
    
    
    
    
}
