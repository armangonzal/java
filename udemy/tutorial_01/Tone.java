import java.util.Scanner;

public class Tone {

  public static void askforTone(){
    int toneVal;
    String[] valList = {"white", "light", "gray", "dark", "black"};

    System.out.println("What tone do you want?");
    Scanner sc1 = new Scanner(System.in);
    if(sc1.hasNextInt()){
      toneVal = sc1.nextInt();
      if(toneVal <= 4){
         
      } else {

      }
    }
  }

}
