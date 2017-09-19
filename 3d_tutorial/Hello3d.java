import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Hello3d extends Applet{
  private Image spiral = null;

  public void paint(Graphics g){
    if(spiral == null){
      spiral = getImage("spiral.png");
    }
    Graphics2D g2 = (Graphics) g;
    g2.drawImage(spiral, 25, 50, 25, 25, null);
  }

  public Image getImage (String path){
    Image tempImage = null;
    try{
      URL imageURL = Hello3d.class.getResource(path);
      tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
    } catch (Exception e){
      System.out.println("An error occurred - " + e.getMessage());
    }
    return tempImage;
  }
}
