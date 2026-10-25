import java.util.Scanner;

public class LexographicallySmallestLargestSubstring {
/* A substring of a string is a contiguous block of characters in the string. For example, the substrings
    of abc are a , b , c , ab , bc , and abc .
    Given a string,s, and an integer,k, complete the function so that it finds the lexicographically smallest
    and largest substrings of length k.

 */

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //welcometojava
        //3
        for(int i = 0;i<=s.length()-k;i++){
            String subString = s.substring(i,i+k);
            //when index is 0, set the smallest substring
            if(i == 0){
                smallest = subString;
            }
            //Greater than 0 (> 0): The first string comes after the second string alphabetically.
            if(subString.compareTo(largest)>0){
                largest = subString;
            //• Less than 0 (< 0): The first string comes before the second string alphabetically.
            }else if(subString.compareTo(smallest)<0)
                smallest = subString;
        }

        return smallest + "\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
