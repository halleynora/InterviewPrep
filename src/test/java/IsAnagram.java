import java.util.HashMap;
import java.util.Scanner;

public class IsAnagram {

    public static boolean isAnagramFrequencyArray(String s, String t) {
        // If lengths don't match, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert both strings to lowercase first
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Array for 26 lowercase English letters
        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++; // Increment for string s
            charCounts[t.charAt(i) - 'a']--; // Decrement for string t
        }

        // If any value is non-zero, they are not anagrams
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();

        // Count frequencies in the first string
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Decrement frequencies using the second string
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) == 0) {
                countMap.remove(c);
            }
        }

        // If map is empty, all frequencies matched perfectly
        return countMap.isEmpty();
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagramFrequencyArray(a, b);
        boolean ret2 = isAnagramHashMap(a, b);
        System.out.println( (ret2) ? "Anagrams" : "Not Anagrams" );
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
