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
