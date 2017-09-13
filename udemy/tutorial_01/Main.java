import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Rectangle;

public class Main {

  public static void main(String[] args) {

    DrawColor dc = new DrawColor();

    JFrame window = new JFrame();
    window.setSize(640, 480);
    window.setTitle("Color Window");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.add(dc);
  }

}
