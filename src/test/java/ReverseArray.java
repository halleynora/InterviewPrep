public class ReverseArray {

    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 2, 3, 4, 5};
        System.out.println("I am a Geek");
        int[] reverseArray = reverseArray(arr);
    }

    public static int[] reverseArray(int[] data) {
        int left = 0;
        int right = data.length - 1;

        while( left < right ) {
            // swap the values at the left and right indices
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            // move the left and right index pointers in toward the center
            left++;
            right--;
        }

        return data;
    }
}
