public class LinkedListCycle2 {
    public static Node firstNode(Node head) {
        // Write your code here.
        if(head == null || head.next==null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node entry = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;


            if(slow == fast){
                
                while(entry != slow){
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
        }
        }

        return null;
    }
}
