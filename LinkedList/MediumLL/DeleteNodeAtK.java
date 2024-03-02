public class DeleteNodeAtK {
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        if(head == null){
            return null;
        }
        
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int Rem = len-K;
        if(Rem==0){
            head = head.next;
            return head;
        }
        int count = 1;
        temp = head;
        while(temp.next!=null && count <= Rem){
            if(count==Rem){
                temp.next = temp.next.next;
                return head;
            }
            count++;
            temp = temp.next;
        }


        return head;
    }
}
