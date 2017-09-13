import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Rectangle;

public class Main {

  public static void main(String[] args) {
    //Paint paint01 = new Paint();
    
    //paint01.askforpaint();
    JFrame window = new JFrame();
    window.setSize(640, 480);
    window.setTitle("Color Window");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    DrawColor dc = new DrawColor();
    window.add(dc);
  }

}
