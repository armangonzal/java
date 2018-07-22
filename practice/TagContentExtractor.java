import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            
            String regex = "[<]([a-zA-Z0-1]+)[>](.+)[<][/]\\1[>]";
            
            Pattern p = Pattern.compile(regex);
            
            Matcher m = p.matcher(line);
            
            matchTag(m, p);
            /*
            if(!m.find())System.out.println("None");
            else
            {
            while(m.find())
               {
                  String sub = m.group();
                  sub = sub.replaceAll(m.group(), m.group(2));
                  System.out.println(sub);
               }
            }*/
			
			testCases--;
		}
	}
   
   public static void matchTag(Matcher m, Pattern p)
   {
      
      //Pattern p = Pattern.compile(regex);
      //Matcher m = p.matcher(str);
      m.reset();
      if(!m.find())System.out.println("None");
      else
      {
         m.reset();
         //System.out.printf("whole: %s%n",m.group());
         while(m.find())
         {
            //System.out.printf("sub before: %s%n",m.group());
            String sub = m.group(2);
            Matcher m2 = p.matcher(sub);
            if(m2.find()) matchTag(m2, p);
            else System.out.println(sub);  
         }
      }           
   }
   
   
}