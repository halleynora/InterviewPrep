public class Fix34 {

    public static int[] fix34(int[] nums) {

//        Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
//        Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that
//        is not a 3, and a 3 appears in the array before any 4.
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == 3) {
                //save the value we are replacing with 4
                int temp = nums[x + 1];
                nums[x + 1] = 4;

                //start a for loop 2 past the current index because 3 & 4 are already there
                for (int j = x + 2; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = temp;
                    }
                }
            }

        }
        return nums;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] {1, 3, 1, 4, 4, 3, 1};
        System.out.println("I am a Geek");
        int[] fix34 = fix34(arr);
        for (int fix:fix34
             ) {
            System.out.println(fix);
        }

    }
}
