import java.util.Scanner;
public class Main {

  String[] colorlist = {"red", "blue", "yellow"};
  boolean[] usedcolorlist = {false, false, false};

  public static void main(String[] args) {
    askforpaintloop();
  }

  public static void askforpaintloop(){

    boolean paintcolor;
    Scanner sc;
    int morepaint;

    for(int i = 1; i < 3; i++ ){
      usedcolorlist[i] = askforcolor(colorlist[i]); 

      if(i < 2){
        System.out.println("More Paint? Enter:\n0: no\n1: yes");
        sc = new Scanner(System.in);
      } 

      if(sc.hasNextInt()) { 
        morepaint = sc.nextInt();
        if (checkanswer(morepaint)){
          //continue
        } else {
          System.out.println("Okay no more paint");
          mixpaint(usedcolorlist[0], usedcolorlist[1], usedcolorlist[2]);
        }
      }

    }
  }

  public static void askforpaint(){
    boolean redpaint = askforcolor("red");
    
    System.out.println("More Paint? Enter:\n0: no\n1: yes");
    Scanner sc1 = new Scanner(System.in);
    int morepaint1;

    if(sc1.hasNextInt()) { 
      morepaint1 = sc1.nextInt();
      if (checkanswer(morepaint1)){
        boolean bluepaint = askforcolor("blue");
        System.out.println("More Paint? Enter:\n0: no\n1: yes");
        
        Scanner sc2 = new Scanner(System.in);
        int morepaint2;

        if(sc2.hasNextInt()) { 
          morepaint2 = sc2.nextInt();
          if (checkanswer(morepaint2)){
            boolean yellowpaint = askforcolor("yellow");
            mixpaint(redpaint, bluepaint, yellowpaint);
          } else {
            System.out.println("Okay no more paint");
            mixpaint(redpaint, bluepaint);
          }
        }
      } else {
        System.out.println("Okay no more paint");
        mixpaint(redpaint);
      }
    }

  }



public static boolean askforcolor(String color){
  System.out.println("Do you want " + color + " paint? Enter:\n0: no\n1: yes");
    Scanner sc = new Scanner(System.in);
    int coloranswer;
    if(sc.hasNextInt()) {
      coloranswer = sc.nextInt();
      if (acceptanswer(coloranswer)){
        return checkanswer(coloranswer);
      } else {
          return false;
      }
    } else {
      return false;
    }
}  

public static boolean acceptanswer(int answer){
  if (answer == 1 || answer == 0){
    return true;
  } else {
    return false;
  }
}

  public static boolean checkanswer(int answer){
    if(answer == 1){
      return true;
    } else {
      return false;
    }
  }

  public static void mixpaint(boolean red, boolean blue, boolean yellow){
    if(red && blue && yellow) {
      System.out.println("Your final color is Black");
    } 
    else if (red && blue && yellow == false){
      System.out.println("Your final color is Violet");
    }
    else if (red && blue == false && yellow){
      System.out.println("Your final color is Orange");
    }
    else if (red == false && blue && yellow){
      System.out.println("Your final color is Green");
    }
    else if (red && blue == false && yellow == false){
      System.out.println("Your final color is Red");
    }
    else if (red == false && blue == false && yellow){
      System.out.println("Your final color is Yellow");
    }
    else if (red == false && blue && yellow == false){
      System.out.println("Your final color is Blue");
    }
    else {
      System.out.println("No paint!");
    }
  }

  public static void mixpaint(boolean red, boolean blue){
    if(red && blue) {
      System.out.println("Your final color is Violet");
    }
    else if (red && blue == false){
      System.out.println("Your final color is Red");
    }
    else if (red == false && blue){
      System.out.println("Your final color is Blue");
    }
    else {
      System.out.println("No paint!");
    }
  }

  public static void mixpaint(boolean red){
    if (red){
      System.out.println("Your final color is Red");
    }
    else {
      System.out.println("No paint!");
    }
  }

}
