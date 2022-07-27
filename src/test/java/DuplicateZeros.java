public class DuplicateZeros {

    public static int[] duplicateZeros(int[] arr) {

// Input: arr = [1,0,2,3,0,4,5,0]
// Output:      [1,0,0,2,3,0,0,4]

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                //walking through the array and checking each element. So if I find a 0, I shift the //elements on the right side to the right by 1 (arr.length - 2 is the second last element).
                for (int j = arr.length - 2; j >= i; j--)
                {
                    arr[j + 1] = arr[j];
                }
                i++;
            }
        }

        return arr;
    }


    public static void main(String[] args)
    {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        System.out.println("I am a Geek");
        int[] duplicateZeros = duplicateZeros(arr);
        for (int index:duplicateZeros) {
            System.out.println(" " + index);
        }
        System.out.println("array:" + duplicateZeros);
    }
}
