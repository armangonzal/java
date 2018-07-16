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
            
            while(m.find())
            {
               String sub = m.group();
               sub = sub.replaceAll(m.group(), m.group(2));
               System.out.println(sub);
            }
            //if(line.matches(regex)) System.out.println(line);
            //else System.out.println("Invalid");
			
			testCases--;
		}
	}
}