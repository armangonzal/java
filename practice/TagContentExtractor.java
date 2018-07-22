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
            
            String regex = "[<](.+)[>](.+)[<][/]\\1[>]";           
            Pattern p = Pattern.compile(regex);            
            Matcher m = p.matcher(line);
            
            matchTag(m, p);

			
			testCases--;
		}
	}
   
   public static void matchTag(Matcher m, Pattern p)
   {
      m.reset();
      if(!m.find())System.out.println("None");
      else
      {
         m.reset();
         while(m.find())
         {
            String sub = m.group(2);
            Matcher m2 = p.matcher(sub);
            if(m2.find()) matchTag(m2, p);
            else
            {
               String regex3 = "[<](.+)[>](.*)[<][/](.+)[>]";           
               Pattern p3 = Pattern.compile(regex3);            
               Matcher m3 = p3.matcher(sub);
               if(m3.find())System.out.println("None");
               else System.out.println(sub);  
            }
         }
      }           
   }
   
   
}
/*
10
<h1>some</h1>
<h1>had<h1>public</h1></h1>
<h1>had<h1>public</h1515></h1>
<h1><h1></h1></h1>
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>
<>hello</>
<>hello</><h>dim</h>
<>hello</><h>dim</h>>>>>
*/

/*
some
public
None
None
None
None
None
None
dim
dim
*/