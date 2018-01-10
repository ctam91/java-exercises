import java.util.LinkedList;

public class LinkedListNode {

    public class Node{
        int data;
        Node next;
    }

    public Node nthToLast(Node head, int n){
        Node p1 = head;
        Node p2 = head;

        for(int i = 0; i < n; i++){
            p1 = p1.next;
        }

        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

}
