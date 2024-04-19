/*
Consider the leftmost and righmost appearances of some value in an array. We'll say that the
"span" is the number of elements between the two inclusive. A single value has a span of 1.
Returns the largest span found in the given array. (Efficiency is not a priority.)
maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */
public class MaxSpan {
    public static int maxSpan(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {

                if (nums[i] == nums[k]){
                    int temp = k - i + 1;
                    if (temp > ans)
                        ans = temp;
                }

            }
        }

        return ans;

    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1, 3, 1, 4, 4, 3, 1};
        System.out.println("I am a Geek");
        int maxSpan = maxSpan(arr);
        System.out.println("max span " + maxSpan);
    }
}
