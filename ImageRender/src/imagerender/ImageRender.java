/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagerender;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.URL;
import java.awt.Toolkit;

/**
 *
 * @author MandoG
 */
public class ImageRender extends Applet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private Image peanut = null;

    @Override
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
                 URL imageURL = ImageRender.class.getResource(path);
                 tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
              }
              catch (Exception e)
              {
                    System.out.println("An error occured - " + e.getMessage());
              }
              return tempImage;
       }
    
}
