public class ReverseLinkedList {
//    The approach involves iterating through the linked list while maintaining three pointers: prev, curr, and next. At each step, we reverse the curr node's pointer to point to prev instead of its original next node.
//    Then we move the prev, curr, and next pointers one step ahead in the list. We repeat this process until we reach the end of the linked list. Finally, we update the head of the linked list to be the last node encountered (curr),
//    which now becomes the new head of the reversed list.
    public ListNode reverseList(ListNode head) {
        ListNode data=head;
        ListNode curr=null;
        ListNode prev=null;
        while(data!=null){
            curr=data;
            data=data.next;
            curr.next=prev;
            prev=curr;
        }
        head=curr;
        return head;
    }
}
