import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
For this problem, we have types of queries you can perform on a List:
1. Insert at index :
Insert
x y
2. Delete the element at index :
Delete
x
Given a list, , of integers, perform queries on the list. Once all queries are completed, print the
modified list as a single line of space-separated integers.
Input Format
The first line contains an integer, (the initial number of elements in ).
The second line contains space-separated integers describing .
The third line contains an integer, (the number of queries).
The subsequent lines describe the queries, and each query is described over two lines:
If the first line of a query contains the String Insert, then the second line contains two space
separated integers , and the value must be inserted into at index .
If the first line of a query contains the String Delete, then the second line contains index , whose
element must be deleted from .
 */

public class QueryOnList {
    public static void main(String[] args) {
        /* Create and fill Linked List of Integers */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        /* Perfrom queries on Linked List */
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        /* Print our updated Linked List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
