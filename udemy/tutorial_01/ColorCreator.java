import java.util.Scanner;
import java.awt.Color;

public class ColorCreator {
   private int red = 0;
   private int green = 0;
   private int blue = 0;
   private int tone = 0;
   private String colorName = "black";
   Color colorPrime = new Color(red, green, blue);


  public void nameColor(){
    double ratio = 1;
    if(red == green && red == blue && green == blue){
      if(red == 0){
        colorName = "black";
      } else if(red == 255){
        colorName = "white";
      } else {
        colorName = "gray";
      }
    } else if(red >= green && red >= blue){
        if(blue > green){
            ratio = (double) (blue-green)/(red-green);
            if (ratio < 0.5) {
              colorName = "red";
            } else {
              colorName = "violet";
            }
        } else if (green > blue){
            ratio = (double) (green-blue)/(red-blue);
            if (ratio < 0.25) {
              colorName = "red";
            } else if (ratio >= 0.25 && ratio < 0.75) {
              colorName = "orange";
            } else {
              colorName = "yellow";
            }
        } else {
            colorName = "red";
        }
    } else if(green >= red && green >= blue){
        if(blue > red){
            colorName = "green";
        } else if (red > blue){
          ratio = (double) (red-blue)/(green-blue);
          if (ratio < 0.5) {
            colorName = "green";
          } else {
            colorName = "yellow";
          }
        } else {
            colorName = "green";
        }
    } else if(blue >= green && blue >= red){
        if(red > green){
            ratio = (double) (red-green)/(blue-green);
            if (ratio < 0.5) {
              colorName = "blue";
            } else {
              colorName = "violet";
            }
        } else if (green > red){
            colorName = "blue";
        } else {
            colorName = "blue";
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
    colorPrime = new Color(red, green, blue);
  }

  public void idTone(){
    tone = (red+green+blue)/3;
    String hexTone = Integer.toHexString(tone);

    System.out.println("Your tone scale value is: #" + hexTone);
  }
}
