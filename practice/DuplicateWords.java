import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        //"\\b(([a-z]{1}[a-zA-z])*|([A-Z]{1}[a-zA-Z])*){2,}\\b"
        String regex = "(\\b[a-zA-z]+\\b){2,}";
        //"\\b[a-zA-z]+\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("[a-zA-z]+", "dog");/* The regex to replace */ /* The replacement. */            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}