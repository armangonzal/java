import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;*/

public class Events extends JFrame {
    private JLabel label;
    private JButton button;

    public Events(){
        setLayout(new FlowLayout());

        button = new JButton("Click for text");
        add(button);

        label = new JLabel("");
        add(label);

        Event e = new Event();
        button.addActionListener(e);
    }


    public class Event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("You are my favorite");
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
