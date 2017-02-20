import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.URL;
import java.awt.Toolkit;

public class ImageTest extends Applet
{

       private Image peanut = null;

       public void paint(Graphics g)
       {
              if (peanut == null)

                 peanut = getImage("img/Me_and_P.jpg");
                 
                 Graphics2D g2 = (Graphics2D)g;
                 g2.drawImage(peanut, 0, 0, 50, 50, null);


       }
       
       public Image getImage(String path)
       {
              Image tempImage = null;
              try
              {
                 URL imageURL = ImageTest.class.getResource(path);
                 tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
              }
              catch (Exception e)
              {
                    System.out.println("An error occured - " + e.getMessage());
              }
              return tempImage;
       }
}