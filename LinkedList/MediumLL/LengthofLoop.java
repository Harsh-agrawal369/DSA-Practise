public class LengthofLoop {
    public static int lengthOfLoop(Node head) {
        // Write your code here
        if(head == null){
            return 0;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int count = 1;
                slow = slow.next;
                while (slow != fast) {
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }

        return 0;
    }
}
