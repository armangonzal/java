import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class RegexIP{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    
   String pattern = "((\\d{1,2}|[0-1]\\d{1,2}|[2][5][0-5]|[2][0-4]\\d)[.]){3}"
                     +"(\\d{1,2}|[0-1]\\d{1,2}|[2][5][0-5]|[2][0-4]\\d)";
  
}