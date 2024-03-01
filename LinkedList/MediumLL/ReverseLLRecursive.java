class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

public class ReverseLLRecursive {
    
    public static Node reverseLinkedList(Node head){

        if(head == null || head.next==null){
            return head;
        }

        Node newHead = reverseLinkedList(head.next);

        Node front = head.next;
        front.next = head;

        //We are taking only two linked List at a time so we are putting last element next as Null.
        head.next = null;

        return newHead;
    }
}
