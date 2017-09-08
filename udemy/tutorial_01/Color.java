import java.util.Scanner;

public class Color {
   private int red = 0;
   private int green = 0;
   private int blue = 0;
   private int tone = 0;
   private String colorName = "black";

  public void nameColor(){
    if(red == green && red == blue && green == blue){
      if(red == 0){
        colorName = "black";
      } else if(red == 255){
        colorName = "white";
      } else {
        colorName = "gray";
      }
    } else if(red >= green && red >= blue){
      colorName = "red ";
      if(blue > green){
        colorName += "blue";
      } else if (green > blue){
        colorName += "green";
      }
    } else if(green >= red && green >= blue){
      colorName = "green ";
      if(blue > red){
        colorName += "blue";
      } else if (red > blue){
        colorName += "red";
      }
    } else if(blue >= green && blue >= red){
      colorName = "blue ";
      if(red > green){
        colorName += "red";
      } else if (green > red){
        colorName += "green";
      }
    }

    System.out.println("The name of your color is " + colorName + ".");
  }

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

  public void idColor(){
    int colorlist[] = {red, green, blue};
    String hexlist[] = new String[3];

    for (int i = 0; i < colorlist.length; i++){
      if (colorlist[i] < 16) {
        hexlist[i] = "0" + Integer.toHexString(colorlist[i]);
      }
      else {
        hexlist[i] = Integer.toHexString(colorlist[i]);
      }
    }

    System.out.println("Your hex color is: #" + hexlist[0] + hexlist[1] + hexlist[2]);
  }

  public void idTone(){
    tone = (red+green+blue)/3;
    String hexTone = Integer.toHexString(tone);

    System.out.println("Your tone scale value is: #" + hexTone);
  }
}
