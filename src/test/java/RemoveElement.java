public class RemoveElement {
    public static int removeElement(int[] nums, int val) {

        int p = 0, i = 0;
        while(i < nums.length){
            if(nums[i++] != val){
                nums[p++] = nums[i-1];
            }
        }
        return p;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 2, 3, 4, 5,7};
        int num = removeElement(arr,3);
        System.out.println(num);
    }

}
