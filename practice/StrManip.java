import java.io.*;
import java.util.*;

public class StrManip {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int sumLen = A.length()+B.length();
        String grA = "Yes";
        if(A.compareTo(B) <= 0) grA = "No";
        
        String capA = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
        String capB = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
        
        System.out.printf("%d%n%s%n%s %s%n",sumLen, grA, capA, capB);
        
    }
}