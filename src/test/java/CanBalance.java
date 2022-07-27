public class CanBalance {
    public static boolean canBalance(int[] nums) {
        int lSum = 0;

        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            int rSum = 0;
            for (int j = nums.length-1; j > i; j--) {
                rSum += nums[j];
            }
            if (rSum == lSum)
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {2, 1, 1, 2, 1};
        System.out.println("I am a Geek");
        boolean canBalance = canBalance(arr);
        System.out.println("Can Balance " + canBalance);
    }
}
