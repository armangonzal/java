import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;

public class ColorDrawing extends JComponent{
  boolean colorComplete = false;
  ColorCreator testcolor = new ColorCreator();



  public void drawColor(){
    testcolor.askforRGB();
    colorComplete = true;
  }

  public void paintComponent(Graphics g){

    Graphics2D g2 = (Graphics2D) g;
    Color colorChosen = new Color(testcolor.red, testcolor.green, testcolor.blue);
    g2.setColor(colorChosen);
    Rectangle rect = new Rectangle(270, 190, 100, 100);
    g2.fill(rect);
  }
}
