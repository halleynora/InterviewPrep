public class ReverseString {
    public static String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }

    public static void main(String[] args)
    {
        String reverse = "reverseme";
        System.out.println("I am a Geek");
        String output = reverseString(reverse);
        System.out.println("Output:" + output);
    }
}
