import java.util.Scanner;
public class Main {

  public static void main(String[] args) {

    Paint paint01 = new Paint();
    Color testcolor = new Color();

    //testcolor.askforRGB(testcolor.red, testcolor.green, testcolor.blue);
    testcolor.red = testcolor.askforcolor("red");
    testcolor.green = testcolor.askforcolor("green");
    testcolor.blue = testcolor.askforcolor("blue");
    testcolor.idHue(testcolor.red, testcolor.green, testcolor.blue);

    //paint01.askforpaint();
  }
}
