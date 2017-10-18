/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.ArrayList;
/**
 *
 * @author MandoG
 */
public class MonsterList {
    private ArrayList<String> monsters = new ArrayList<String>();
    
    public void addMonster(String item){
        monsters.add(item);
    }
    
    public void printMonsterList(){
        for(int i=0; i<monsters.size(); i++){
            System.out.println((i+1)+". "+monsters.get(i));
        }
    }
    
    public void modifyMonsterList(int position, String item){
        monsters.set(position, item);
        System.out.println("Monster at position "+(position+1)+" has been modified");
    }
    
    public void removeMonster(int position){
        String theMonster = monsters.get(position);
        monsters.remove(position);
    }
    
    public String searchMonsters(String searchItem){
        boolean exists = monsters.contains(searchItem);
        if(exists){
            int position = monsters.indexOf(searchItem);
            return monsters.get(position);
        }
        return null;
    }
}
