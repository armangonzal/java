import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    
    }
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = true;
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length() != b.length()) return false;
        
        for(int i=0; i<a.length(); i++)
        {
            char testChar = a.charAt(i);
            if(a.indexOf(testChar)== i)
            {
               if(countReps(a, testChar) != countReps(b, testChar)) result = false;
            }
        }
        
        return result;
    }
    
    static int countReps(String c, char y)
    {
      int count = 0;
      for(int i=0; i<c.length(); i++)
      {
         if(c.charAt(i) == y) ++count;
      }
      return count;
    }
}