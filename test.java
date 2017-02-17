import java.util.Scanner;

public class Test {
       public static void main(String[] args){
              System.out.println("Enter a Number:");
              Scanner kbd = new Scanner(System.in);
              int number = kbd.nextInt();
              System.out.println(number);
              
              System.out.println("Enter another Number:");
              Scanner kbd02 = new Scanner(System.in);
              int number02 = kbd02.nextInt();
              System.out.println(number02);
       }
}