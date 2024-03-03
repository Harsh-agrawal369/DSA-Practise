public class sort012 {
    public static Node sortList(Node head) {
        // Write your code here
        if(head == null || head.next == null){
            return head;
        }

        Node dum0 = new Node(-1);
        Node temp0 = dum0;

        Node dum1= new Node(-1);
        Node temp1 = dum1;

        Node dum2 = new Node(-1);
        Node temp2 = dum2;

        while(head!=null){
            if(head.data == 0){
                temp0.next = head;
                temp0 = head;
            }else if(head.data == 1){
                temp1.next = head;
                temp1 = head;
            }else{
                temp2.next = head;
                temp2 = head;
            }

            head = head.next;
        }
        temp2.next = null;
        temp0.next = dum1.next;
        temp1.next = dum2.next;
        
        return dum0.next;
    }
}
