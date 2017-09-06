import java.util.Scanner;

public class Color {
   private int red = 0;
   private int green = 0;
   private int blue = 0;
   private int tone = 0;
   private boolean lowest[] = {false, false, false};
   private boolean highest[] = {false, false, false};


  public void nameColor(){
    String colorName = "";
    String colorlist[] = {"red", "green", "blue"};
    for(int i = 0; i < 3; i++){
      if(highest[i]){
        colorName = colorlist[i] + " " + colorName;
      } else if (highest[i] == false && lowest[i] == false) {
        colorName += " " + colorlist[i];
      }
    }
    System.out.println(colorName);
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

  public void sortColors(){
    int colorlist[] = {red, green, blue};

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        lowest[i] = true;
        if (i != j && colorlist[i] >= colorlist[j]){
            lowest[i] = false;
            break;
        }
      }
    }

    for(int k = 0; k < 3; k++){
      for(int l = 0; l < 3; l++){
        highest[k] = true;
        if (k != l && colorlist[k] <= colorlist[l]){
            highest[k] = false;
            break;
        }
      }
    }

    System.out.println("highest: " + highest[0] + ", " + highest[1] + ", " + highest[2]);
    System.out.println("lowest: " + lowest[0] + ", " + lowest[1] + ", " + lowest[2]);

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
