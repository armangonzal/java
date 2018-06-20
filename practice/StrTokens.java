import java.io.*;
import java.util.*;

public class StrTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        if(s.matches("[A-Za-z !,?._'@]+"))
        {
            String[] splits = s.split("[A-Za-z]",2);

            if(splits[0].length() == s.length())
            {
               System.out.println(0);
            }
            else
            {
               s = s.substring(splits[0].length(), s.length());
            
               String[] tokens = s.split("[ !,?._'@]+");
               
               System.out.println(tokens.length);
               
               for(String token : tokens)
               {
                  if(token.matches("[A-Za-z]+")) System.out.println(token);
                  
               }
            }
            
        }            
                
        scan.close();            
    }
    
 }