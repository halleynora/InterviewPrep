import org.jetbrains.annotations.NotNull;

public class LongestRunningPrefixTest {

    public static String longestCommonPrefix(String @NotNull [] strs) {

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int x=1; x<strs.length; x++) {
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

