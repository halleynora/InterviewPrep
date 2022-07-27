public class CountConsecutiveClumps {

    public static int countConsecutiveClumps(int[] nums) {
        int clumpCount = 0;
        boolean isClump = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (isClump) {
                if (nums[i] != nums[i + 1])
                    isClump = false;
            }
            else if(nums[i] == nums[i + 1]) {
                    isClump = true;
                    clumpCount++;
            }

        }
        return clumpCount;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,2,2,3,4,4};
        System.out.println("I am a Geek");
        int clumpCount = countConsecutiveClumps(arr);
        System.out.println("Clump Count:" + clumpCount);
    }
}