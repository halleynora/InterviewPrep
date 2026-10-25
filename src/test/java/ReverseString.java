import java.util.Scanner;

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

    public static String reverseStringFunction(String s) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder reverseString = new StringBuilder(A).reverse();
        return reverseString.toString();
    }

    public static void main(String[] args)
    {
        String reverse = "reverseme";
        String output = reverseString(reverse);
        System.out.println("Output:" + output);

        System.out.println("Output:" + reverseStringFunction(reverse));

    }
}
