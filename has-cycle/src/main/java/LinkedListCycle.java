public class LinkedListCycle {

    public class Node{
        int data;
        Node next;
    }

    public boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Node fast = head.next;
        Node slow = head;

        while(fast != slow){
            if(fast == null && fast != null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
