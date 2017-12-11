/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author MandoG
 */
public class Test {

    /**
     * @param args the command line arguments
     
     */
    public static int sumRowCol(int[][] a, int m, int n){
        int sumRow =0;
        int sumCol =0;
        
        for(int i=0; i < a[m].length; i++){
            sumRow += a[m][i];
        }
        for(int i=0; i<a.length; i++){
            sumCol += a[i][n];
        }
        
        return sumRow + sumCol;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] bf = {{0,8,3,2},
                      {1,1,1,-1},
                      {-4,2,3,-10}};
        System.out.println(sumRowCol(bf, 1, 3));
        }
        
}
