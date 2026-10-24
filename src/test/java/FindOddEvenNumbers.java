import java.util.ArrayList;
import java.util.List;

public class FindOddEvenNumbers {




    public static List<Integer> findOddNumbersWithLoop(int[] numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static List<Integer> findEvenNumbersWithLoop(int[] numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 2, 3, 4, 5};
        List<Integer> findOdd = findOddNumbersWithLoop(arr);
        for (int index:findOdd) {
            System.out.println(" " + index);
        }
    }
}
