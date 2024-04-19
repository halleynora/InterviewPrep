import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        String myString = "1112222333345555556";
        int firstUnique = firstUniqChar(myString);
        System.out.println(firstUnique);
    }
}
