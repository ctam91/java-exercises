public class LinkedList {
    Node head;

    //Implement method to add new Node to end of LinkedList
    public void append(int data){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    //Implement method to preprend new Node
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data){
        Node current = head;
        if(current.data == data){
            head = head.next;
            return;
        }
        while(current.next != null) {
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
