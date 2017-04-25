import javax.swing.JFrame;

public class FuelCount {
  public static void main(String[] args){
    
    int fuelLevel = 3;
    int canDrive = (fuelLevel > 1) ? fuelLevel : 0;
    System.out.println(canDrive);
    
    JFrame window = new JFrame();
    window.setSize(640, 480);
    window.setTitle("JFrame Window");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

  } 
  
}