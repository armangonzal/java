import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    askforpaint();
    //mixpaint(true, true, true); 
  }

  public static void askforpaint(){
    boolean redpaint = askforcolor("red");
    
    System.out.println("More Paint? y/n:");
    Scanner sc1 = new Scanner(System.in);
    String morepaint1 = sc1.nextLine();

    if (checkanswer(morepaint1)){
      boolean bluepaint = askforcolor("blue");
    } else {
      System.out.println("Okay no more paint");
    }


  }

public static boolean askforcolor(String color){
  System.out.println("Do you want " + color + " paint? y/n:");
    Scanner sc = new Scanner(System.in);
    String coloranswer = sc.nextLine();
    if (acceptanswer(coloranswer)){
      return checkanswer(coloranswer);
    } else {
      return false;
    }
}  

public static boolean acceptanswer(String answer){
  if (answer == "y" || answer == "n"){
    return true;
  } else {
    return false;
  }
}

  public static boolean checkanswer(String answer){
    if(answer == "y"){
      return true;
    } else {
      System.out.println("Your answer is false: " + answer);
      return false;
    }
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
