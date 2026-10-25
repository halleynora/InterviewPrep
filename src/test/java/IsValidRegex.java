import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class IsValidRegex {

    public static boolean isValidRegex(String regex) {
        if (regex == null) {
            return false;
        }
        try {
            Pattern.compile(regex);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidRegex("[a-z]+")); // Prints true
        System.out.println(isValidRegex("[a-z"));    // Prints false (unclosed character class)
    }
}
