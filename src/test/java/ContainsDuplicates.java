import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static boolean containsDuplicateHashMap(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }


    public static void main(String[] args)
    {
        int[] arr = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println("I am a Geek");
        boolean containsDuplicate = containsDuplicateHashSet(arr);
        System.out.println("Contains duplicates:" + containsDuplicate);
        containsDuplicate = containsDuplicateHashMap(arr);
        System.out.println("Contains duplicates:" + containsDuplicate);
    }
}
