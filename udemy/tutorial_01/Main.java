import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Tone tone01 = new Tone();
    Paint paint01 = new Paint();
    Color testcolor = new Color();


    System.out.println("Enter a hue from 0 to 59:");
    Scanner SChue = new Scanner(System.in);
    if(SChue.hasNextInt()){
      testcolor.hue = SChue.nextInt();
      System.out.println(testcolor.idHue(testcolor.hue));
    } else {
      System.out.println("Not an acceptable hue value");
    }

    System.out.println("Enter a saturation value from 0 to 100");
    Scanner SCsat = new Scanner(System.in);
    if(SCsat.hasNextInt()){
      testcolor.saturation = SCsat.nextInt();
      System.out.println("Saturation value is: " + testcolor.saturation);
    } else {
      System.out.println("That is not an acceptable saturation value.");
    }


    //paint01.askforpaint();
  }
}
