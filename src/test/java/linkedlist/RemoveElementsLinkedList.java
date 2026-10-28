package linkedlist;

public class RemoveElementsLinkedList {
    //https://leetcode.com/problems/remove-linked-list-elements/solutions/4258042/java-1ms-beats-92-25/

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }


        return dummy.next;
    }

    // Static main method to test your function
    public static void main(String[] args) {
        // Create a sample list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int targetValueToRemove = 6;

        System.out.print("Original list: ");
        printList(head);

        // Call the function
        ListNode result = removeElements(head, targetValueToRemove);

        System.out.print("Modified list: ");
        printList(result);
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

}
