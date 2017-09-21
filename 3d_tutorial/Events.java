import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;*/

public class Events extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private int x =0, y = 0;

    public Events(){
        setLayout(new FlowLayout());

        button1 = new JButton("Click for text");
        add(button1);

        label1 = new JLabel("");
        add(label1);

        button2 = new JButton("Click for more text");
        add(button2);

        label2 = new JLabel("");
        add(label2);

        Event e = new Event();
        button1.addActionListener(e);

        Event2 ev = new Event2();
        button2.addActionListener(ev);
    }


    public class Event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          if(x == 0){
            label1.setText("You are my favorite");
            x = 1;
          } else {
            label1.setText("");
            x = 0;
          }
        }
    }


    public class Event2 implements ActionListener {
        public void actionPerformed(ActionEvent ev){
          if(y == 0){
            label2.setText("So are you!");
            y = 1;
          } else {
            label2.setText("");
            y = 0;
          }

        }
    }


    public static void main (String args[]){
        Events gui = new Events();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Events Program");
        gui.setSize(300, 100);
        gui.setVisible(true);
    }
}
