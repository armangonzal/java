import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Result extends JFrame{
  private JLabel label;
  private JButton button;

  public Result(){
    setLayout(new FlowLayout());

    label = new JLabel("");
    add(label);

    button = new JButton("Click");
    add(button);

    Event e = new Event();
    button.addActionListener(e);
  }


  public class Event implements ActionListener{
    public void actionPerformed(ActionEvent e){
      label.setText("Hello");
    }
  }

  public static void main(String args[]){
    Result gui = new Result();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setTitle("Chub");
    gui.setSize(300, 300);
    gui.setVisible(true);
  }
}
