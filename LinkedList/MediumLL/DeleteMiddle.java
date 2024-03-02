public class DeleteMiddle {

    //Three Variable Approach
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        if(head == null || head.next==null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
    }


    //Two Variable Approach
    // Here we start the fast with head.next.next, Hence we only reach till the 2nd last node.

    public static Node deleteMiddleOptimal(Node head) {

        if(head == null || head.next==null){
            return null;
        }

        Node slow = head;
        Node fast = head.next.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next= slow.next.next;


        return head;
    }

}
