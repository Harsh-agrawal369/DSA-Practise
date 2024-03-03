public class SortLL {

    public static Node GetMid(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node L, Node R){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (L!=null && R!=null) {
            if(L.data<=R.data){
                temp.next=L;
                temp=L;
                L=L.next;
            }else{
                temp.next=R;
                temp=R;
                R=R.next;
            }
        }

        if(L!=null){
            temp.next = L;
        }else{
            temp.next = R;
        }

        return dummy.next;
    }
    public static Node sortList(Node head) {
        //Write your code here
        if(head==null || head.next==null){
            return head;
        }

        Node mid = GetMid(head);

        Node L = head;
        Node R = mid.next;

        mid.next = null;

        L = sortList(L);
        R = sortList(R);
        return merge(L, R);
        
    }
}
