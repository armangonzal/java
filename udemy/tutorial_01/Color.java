import java.util.Scanner;

public class Color {

  int red = 0;
  int green = 0;
  int blue = 0;

  public static int askforcolor(String name){

    int color;
    System.out.println("Enter a value for " + name + " from 0 to 15:");
    Scanner scColor = new Scanner(System.in);
    if(scColor.hasNextInt()){
        if(scColor.nextInt() >= 0 && scColor.nextInt() <= 15){
          color = scColor.nextInt();
          return color;
        } else {
          System.out.println("Please enter a value from 0 to 15.");
          askforcolor(name);
          return 0;
        }
    } else {
      System.out.println("Not an acceptable value.");
      askforcolor(name);
      return 0;
    }

  }

  public static void askforRGB(int red, int green, int blue){
    red = askforcolor("red");
    green = askforcolor("green");
    blue = askforcolor("blue");
  }

  public static void idHue(int red, int green, int blue){

    String hexR = Integer.toHexString(red);
    String hexG = Integer.toHexString(green);
    String hexB = Integer.toHexString(blue);

    System.out.println("Your hex color is: #" + hexR + hexG + hexB);

  }

}
