import java.io.*;
import java.util.*;

public class StrReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println("Is palindrome?: "+checkPalindrome(A));        
                
    }
    
    public static String checkPalindrome(String A)
    {
      int n = A.length()/2;
      boolean isPalindrome = true;
      
      for(int i=0; i<n; i++)
        {
           int u = A.length()-1-i;
           if(A.charAt(i) != A.charAt(u)) isPalindrome = false;
        }
      if(isPalindrome) return "Yes";
      else return "No";
    }
}
