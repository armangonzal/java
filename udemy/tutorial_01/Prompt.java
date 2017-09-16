import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Rectangle;

public class Prompt {


  public void askforwindow(){
    System.out.println("Do you want a color? \n1: yes \n2: no");

    Scanner a1 = new Scanner(System.in);
    int answer = a1.nextInt();

    if(answer == 1){
      ColorDrawing dc = new ColorDrawing();
      dc.drawColor();

      if(dc.colorComplete == true){
        JFrame window = new JFrame();
        window.setSize(640, 480);
        window.setTitle("Color Window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(dc);
      }

    } else if (answer == 2){
      System.out.println("Okay no color.");
    } else {
      System.out.println("Not a valid answer. ");
      askforwindow();
    }


  }


}
