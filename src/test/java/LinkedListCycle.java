import java.util.LinkedList;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head; // Initialize fast pointer to head
        ListNode slow = head; // Initialize slow pointer to head
        while (fast != null && fast.next != null) { // Traverse the list until fast pointer reaches end or NULL
            fast = fast.next.next; // Move fast pointer two steps ahead
            slow = slow.next; // Move slow pointer one step ahead
            if (fast == slow) { // If fast meets slow, there is a cycle
                return true;
            }
        }
        return false; // If fast reaches NULL, there is no cycle
    }

    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println("I am a Geek");
//        Boolean hascycle = hasCycle(ll.get(0));

    }
}
