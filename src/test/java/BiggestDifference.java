public class BiggestDifference {
    public static int bigDiff(int[] nums) {
        int max = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args)
    {
//        bigDiff([10, 3, 5, 6]) → 7
//        bigDiff([7, 2, 10, 9]) → 8
//        bigDiff([2, 10, 7, 2]) → 8
        int[] arr = new int[] {10, 3, 5, 6};
        System.out.println("I am a Geek");

        int difference = bigDiff(arr);
        System.out.println("difference " + difference);
    }
}
