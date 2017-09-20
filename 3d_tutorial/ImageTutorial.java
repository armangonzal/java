import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTutorial extends JFrame {
    private ImageIcon image1;
    private JLabel label1;

    ImageTutorial()  {
      setLayout(new FlowLayout());

      image1 = new ImageIcon(getClass().getResource("Me_and_P.jpg"));

      label1 = new JLabel(image1);
      add(label1);
    }

    public static void main (String args[]){
        ImageTutorial gui = new ImageTutorial();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Image Program");
    }
}
