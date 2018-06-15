/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author MandoG
 */
public class Test {

    /**
     * @param args the command line arguments
    
     */
    public static void backwardsZ(int n){
        for(int i=n; i>0; i--){
            String sline = "";
            for(int k=n; k>0; k--){
                if(i==n || i==1 || i==k)
                    sline += Integer.toString(i);
                else 
                    sline += " ";
            }
            System.out.println(sline);
        }
    }
    
    public static void ntuple(char [] a, int n){
        int count = 0;
        for(int i=0; i < a.length-n+1; i++){
            boolean repeat = false;
            repeatloop:
            for(int j=0; j<n; j++){
                if(a[i] == a[i+j]){
                    if(a[i]==a[i+n-1])
                        repeat = true;
                    }
                else{
                    repeat = false;
                    break repeatloop;
                }  
                    
            }
            if(repeat)
                count += 1;
        }
       System.out.println(count);
    }
    
    public static void formatb(){
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-16s%03d%n",s1,x);
            }
            System.out.println("================================");
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        char[] a = {'b','b','b','b','b','c'};
        ntuple(a,3);
        
        String[] ca = {"sdf","dfd","fgfg"};
        //formatb();
        //backwardsZ(5);
        main(ca);
        }
        
}
