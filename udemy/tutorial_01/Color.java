public class Color {

  int red = 0;
  int green = 0;
  int blue = 0;

  public static int askforcolor(int red, int green, int blue){
    
  }

  public static String idHue(int red, int green, int blue){

    String hexR = Integer.toHexString(red);
    String hexG = Integer.toHexString(green);
    String hexB = Integer.toHexString(blue);

    System.out.println("Your hex color is: #" + hexR + hexG + hexB);

}
