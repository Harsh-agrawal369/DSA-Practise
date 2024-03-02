import java.util.*;

public class SegregatingOddEven {
    
    
    //Segeregating based on even odd data nodes.
    //Brute Force Using Extra Space ArrayList
   public static Node segregateEvenOdd(Node head)
    {
        if(head == null || head.next==null){
            return head;
        }
        // Write Your Code Here.

        Node temp = head;
        Node oddstr = new Node(-1);
        Node Evenstr = new Node(-1);
        Node odd = oddstr;
        Node even = Evenstr;

        while(temp!=null ){
            if(temp.data%2==0){
                even.next = temp;
                even=temp;
            }else{
                odd.next= temp;
                odd=temp;
            }
            temp = temp.next;
            
        }
        odd.next = null;
        temp = Evenstr;
        even.next = oddstr.next;

        return Evenstr.next;
    }


    //Segregating based on the basis of Even Odd Index
    public Node oddEvenList(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node EvenStart = even;
        while(even != null && even.next!= null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = EvenStart;

        return head;
    }
}

