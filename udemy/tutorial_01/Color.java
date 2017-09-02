import java.util.Scanner;

public class Color {
   private int red = 0;
   private int green = 0;
   private int blue = 0;
   private int tone = 0;

  public static int askforcolor(String name){
    int color = 0;
    System.out.println("Enter a value for " + name + " from 0 to 255:");
    Scanner scColor = new Scanner(System.in);
    if(scColor.hasNextInt()){
        color = scColor.nextInt();
        if(color >= 0 && color <= 255){
          return color;
        } else {
          System.out.println("Please enter a value from 0 to 255.");
          return askforcolor(name);
        }
    } else {
      System.out.println("Not an acceptable value.");
      return askforcolor(name);
    }
  }

  public void askforRGB(){
    red = askforcolor("red");
    green = askforcolor("green");
    blue = askforcolor("blue");
  }

  public void idHue(){
    String hexR = Integer.toHexString(red);
    String hexG = Integer.toHexString(green);
    String hexB = Integer.toHexString(blue);

    System.out.println("Your hex color is: #" + hexR + hexG + hexB);
  }

  public void idTone(){
    tone = (red+green+blue)/3;

    System.out.println("Your tone value is: " + tone);

  }
}
