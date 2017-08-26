public class Color {

  int hue = 0;
  int saturation;
  int gray;
  int tone;

  public static String idHue(int hue){
    int i = hue/10;
    switch(i) {
      case 0:
        return "Red";
      case 1:
        return "Orange";
      case 2:
        return "Yellow";
      case 3:
        return "Green";
      case 4:
        return "Blue";
      case 5:
        return "Violet";
      default:
        return "Not visible to human eye!";
    }

  }

  public static int idTone(int saturation, int gray, int tone){
      tone = saturation * gray;
      return tone;
  }

}
