import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    userpaint();
    mixpaint(true, true, true);
    mixpaint(false, true);
    mixpaint(true);
  }

  public static void userpaint(){
    System.out.println("Enter your paint: ");
    Scanner sc = new Scanner(System.in);
    String userchoice = sc.nextLine();
  }

  public static void mixpaint(boolean red, boolean blue, boolean yellow){
    if(red && blue && yellow) {
      System.out.println("Black");
    } 
    else if (red && blue && yellow == false){
      System.out.println("Violet");
    }
    else if (red && blue == false && yellow){
      System.out.println("Orange");
    }
    else if (red == false && blue && yellow){
      System.out.println("Green");
    }
    else if (red && blue == false && yellow == false){
      System.out.println("Red");
    }
    else if (red == false && blue == false && yellow){
      System.out.println("Yellow");
    }
    else if (red == false && blue && yellow == false){
      System.out.println("Blue");
    }
    else {
      System.out.println("No paint!");
    }
  }

  public static void mixpaint(boolean red, boolean blue){
    if(red && blue) {
      System.out.println("Violet");
    }
    else if (red && blue == false){
      System.out.println("Red");
    }
    else if (red == false && blue){
      System.out.println("Blue");
    }
    else {
      System.out.println("No paint!");
    }
  }

  public static void mixpaint(boolean red){
    if (red){
      System.out.println("Red");
    }
    else {
      System.out.println("No paint!");
    }
  }

}
