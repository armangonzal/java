public class Main {
  public static void main(String[] args) {

    char myChar = '\u00A9';

    String myString = "\u00A9 symbol";

    System.out.println(myString);

    boolean isP = true;

    boolean wasP = isP ? true : false;

    if(wasP){
      System.out.println("Was P!!!");
    }

  }
}
