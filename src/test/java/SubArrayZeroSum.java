import java.util.HashSet;
import java.util.Set;

public class SubArrayZeroSum {
    // Function to check if subarray with zero-sum is present in a given array or not
    public static Boolean hasZeroSumSubarray(int[] nums)
    {
        // create an empty set to store the sum of elements of each
        // subarray `nums[0…i]`, where `0 <= i < nums.length`
        Set<Integer> set = new HashSet<>();

        // insert 0 into the set to handle the case when subarray with
        // zero-sum starts from index 0
        set.add(0);

        int sum = 0;

        // traverse the given array
        for (int value: nums)
        {
            // sum of elements so far
            sum += value;

            // if the sum is seen before, we have found a subarray with zero-sum
            if (set.contains(sum)) {
                return true;
            }

            // insert sum so far into the set
            set.add(sum);
        }

        // we reach here when no subarray with zero-sum exists
        return false;
    }

    public static void main(String[] args)
    {
        // an integer array
        int[] nums = { 4, -6, 3, -1, 4, 2, 7};
        boolean hasZeroSum = hasZeroSumSubarray(nums);
        System.out.println("has zero sum: " + hasZeroSum);
    }
}
