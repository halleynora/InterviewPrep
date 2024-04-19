//Given an integer array nums, move all 0's to the end of it while maintaining the relative
// order of the non-zero elements.
//
// Note that you must do this in-place without making a copy of the array.
public class MoveZeros {
    public static void moveZeroesToEnd(int[] nums) {
        int snowBallSize = 0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]==0){
                    snowBallSize++;
                }
                else if (snowBallSize > 0) {
                    int t = nums[i];
                    nums[i]=0;
                    nums[i-snowBallSize]=t;
                }
            }
    }

//    public static void moveZeroesToBeginning(int[] nums) {
//        int snowBallSize = 0;
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]==0){
//                snowBallSize++;
//            }
//            else if (snowBallSize > 0) {
//                int t = nums[i];
//                nums[i]=0;
//                nums[i-snowBallSize]=t;
//            }
//        }
//    }

    public static void main(String[] args)
    {
        // an integer array
        int[] nums = {  0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        moveZeroesToEnd(nums);
        for (int index:nums) {
            System.out.println(" " + index);
        }
    }
}
