public class RemoveElementsLinkedList {
    //https://leetcode.com/problems/remove-linked-list-elements/solutions/4258042/java-1ms-beats-92-25/

    public ListNode removeElements(ListNode head, int val) {

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
}
