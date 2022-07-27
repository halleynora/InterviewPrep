import org.jetbrains.annotations.NotNull;

public class LongestRunningPrefixTest {

    public static String longestCommonPrefix(String @NotNull [] strs) {

        //edge case
        if (strs.length == 0) return "";
        //just grab first item and search for this
        String prefix = strs[0];
        for (int x=1; x<strs.length; x++) {
            //as long as the indexOf != 0 meaning the prefix doesn't exist chop off one
            while (strs[x].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;

    }

    public static void main(String[] args)
    {
        String[] arr = new String[] { "floor", "flood", "flop" };
        System.out.println("I am a Geek");
        String longestPrefix = longestCommonPrefix(arr);
        System.out.println("Longest Prefix:" + longestPrefix);
    }
}

