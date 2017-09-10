import java.util.Scanner;
import java.awt.*;

public class Main {

  public static void main(String[] args) {
    Paint paint01 = new Paint();
    Colormade testcolor = new Colormade();

    Canvas C1 = new Canvas();
    C1.setSize(120,120);
    //C1.setBackground(Color.white);

    Frame F1 = new Frame();
    F1.add(C1);
    F1.setLayout(new FlowLayout());
    F1.setSize(250,250);
    F1.setVisible(true);

    testcolor.askforRGB();
    testcolor.idColor();
    testcolor.idTone();
    testcolor.nameColor();


    //paint01.askforpaint();
  }

}
