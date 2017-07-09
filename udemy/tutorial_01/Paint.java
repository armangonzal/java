import java.util.Scanner;
public class Paint {
    public static void askforpaint(){
        String[] colorlist = {"red", "blue", "yellow"};
        boolean[] usedcolorlist = {false, false, false};
        boolean paintcolor;
        int morepaint;

        outerloop:
        for(int i = 0; i < 3; i++ ){
            usedcolorlist[i] = askforcolor(colorlist[i]);
            if(i < 2){
                System.out.println("Do you wan more Paint? Enter:\n0: no\n1: yes");
                Scanner sc = new Scanner(System.in);
                if(sc.hasNextInt()) {
                    morepaint = sc.nextInt();
                    if(acceptanswer(morepaint)) {
                        if (checkanswer(morepaint)){
                            //continue
                        } else {
                            System.out.println("Okay no more paint");
                            mixpaint(usedcolorlist[0], usedcolorlist[1], usedcolorlist[2]);
                            break outerloop;
                        }
                    } else {
                        System.out.println("Not a valid response. Guess no more paint.");
                        mixpaint(usedcolorlist[0], usedcolorlist[1], usedcolorlist[2]);
                        break outerloop;
                    }
                } else {
                    System.out.println("Not a valid response. We're done here.");
                    break outerloop;
                }
            } else {
                System.out.println("Okay no more paint");
                mixpaint(usedcolorlist[0], usedcolorlist[1], usedcolorlist[2]);
            }
        }
    }

public static boolean askforcolor(String color){
    System.out.println("Do you want " + color + " paint? Enter:\n0: no\n1: yes");
    Scanner sc1 = new Scanner(System.in);
    int coloranswer;
    if(sc1.hasNextInt()) {
        coloranswer = sc1.nextInt();
        if (acceptanswer(coloranswer)){
          return checkanswer(coloranswer);
        } else {
            System.out.println("Not a valid integer. I guess you don't want "+color+" paint.");
            return false;
        }
    } else {
        System.out.println("Not a valid response. I guess you don't want "+color+" paint.");
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
