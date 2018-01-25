
class Solution {

    /**
     * Java implementation to remove a nth node from a LinkedList
     * @param head the LinkedList's head
     * @param n which node to remove (e.g. 2nd == second node to end)
     * @return return the head
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Null checks
        // If head.next is null, then we know that we are removing the head, so return null
        if(head == null || head.next == null){
            return null;
        }

        //Initialize two pointers to help us keep track while we are iterating through linkedlist.
        ListNode current = head, previous = head;

        //Iterate current through linkedlist to place current at nth-1 spaces ahead of previous.
        while(n-- > 0){
            current = current.next;
        }
        //If current is null, then that means that we are deleting the head node (head = head.next, return head)
        if(current == null){
            return head.next;
        }

        //Iterate through while current.next is not null
        while(current.next != null){
            current = current.next;
            previous = previous.next;
        }
        //If current.next is null, then you have reached end of LinkedList. Remove the node next to previous by changing the pointers.
        previous.next = previous.next.next;
        return head;
    }

     public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}