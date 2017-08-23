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
      System.out.println(testcolor.idColor(testcolor.hue));
    } else {
      System.out.println("Not an acceptable hue value");
    }

    //paint01.askforpaint();
  }
}
