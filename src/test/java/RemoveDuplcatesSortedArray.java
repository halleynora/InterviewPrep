public class RemoveDuplcatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input is invalid");
        }

        int len = nums.length;
        if (len <= 1) {
            return len;
        }

        int insertPos = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[insertPos]) {
                nums[++insertPos] = nums[i];
            }
        }

        return insertPos + 1;

    }

    public static void main(String[] args)
    {
        int[] arr = new int[] { 1,1,2};
        System.out.println("I am a Geek");
        int duplcatesRemoved = removeDuplicates(arr);
        System.out.println("Remove Duplicates:" + duplcatesRemoved);
    }
}
