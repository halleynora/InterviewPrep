//Given a non-empty array, return true if there is a place to split the array so that the
// sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//
//canBalance([1, 1, 1, 2, 1]) → true
//canBalance([2, 1, 1, 2, 1]) → false
//canBalance([10, 10]) → true

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
        int[] arr = new int[] {2, 1, 1, 2};
        System.out.println("I am a Geek");
        boolean canBalance = canBalance(arr);
        System.out.println("Can Balance " + canBalance);
    }
}
