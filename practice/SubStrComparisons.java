import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubStrComparisons {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] subs = new String[s.length()-k+1];
        
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
            
        for(int i=0; i<subs.length; i++)
        {   
            subs[i] = s.substring(i, i+k); 
            //System.out.printf("Subs %d: %s%n",i,subs[i]);
            
            boolean smaller = isSmaller(subs[i], smallest, 0);
            boolean larger = isLarger(subs[i], largest, 0);
    
            //System.out.printf("smaller: %b%n",smaller);
            //System.out.printf("larger: %b%n",larger);

            if(larger) largest = subs[i];
            if(smaller) smallest = subs[i];
            
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
    
    public static boolean isLarger(String b, String a, int i)
    {
      boolean larger = false;
      int aVal = (int) a.charAt(i); 
      int bVal = (int) b.charAt(i);
      
      if(bVal > aVal) return true;
      else if(bVal < aVal) return false;
      else
      {
         if(i < a.length()-1) return isLarger(b, a, i+1);   
         else return false;     
      }
    }
    
    public static boolean isSmaller(String b, String a, int i)
    {
      boolean smaller = false;
      int aVal = (int) a.charAt(i); 
      int bVal = (int) b.charAt(i);
      
      if(bVal < aVal) return true;
      else if(bVal > aVal) return false;
      else
      {
         if(i < a.length()-1) return isSmaller(b, a, i+1);   
         else return false;     
      }
    }

    
}