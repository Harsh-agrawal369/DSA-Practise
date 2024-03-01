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


public class ReverseLinkedListItterative
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        if(head==null ){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = head.next;

        while(curr.next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        return curr;
    }
}