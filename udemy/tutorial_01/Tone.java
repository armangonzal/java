import java.util.Scanner;

public class Tone {

  public static void askforTone(){
    int toneVal;
    int satVal;

    askforToneVal();


  }

  public static void askforToneVal(){
    int toneVal;
    System.out.println("What tone do you want? \nEnter a number from 0 to 10:");
    Scanner scTone = new Scanner(System.in);
    if(scTone.hasNextInt()){
      toneVal = scTone.nextInt();
      if(toneVal >= 0 && toneVal <= 10){
         System.out.println("Acceptable tone value.");
      } else {
        System.out.println("Not an acceptable tone value.");
      }
    }

  }

}
