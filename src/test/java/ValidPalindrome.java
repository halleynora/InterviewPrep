public class ValidPalindrome {

    public static boolean validPalindrome (String s) {
        //abba -> same back and fourth
        boolean isPalindrome = false;

        if (s == null)
            return false;
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            if (s.charAt((left)) == s.charAt(right)){
                left++;
                right--;
            }
            else {
                return false;
            }
            return true;
        }

        return isPalindrome;
    }


    public static void main(String[] args)
    {
        String s = new String("abca");
        StringBuilder sb = new StringBuilder(s);
        System.out.println("I am a Geek");
        boolean palindrome = validPalindrome(s);
        System.out.println("Palindrome" + palindrome);
    }
}
