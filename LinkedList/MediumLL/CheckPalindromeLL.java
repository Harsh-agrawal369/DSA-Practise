import java.util.Stack;

public class CheckPalindromeLL {

    //Brute Force Approach O(n) space and O(2n) time complexity
    // public static boolean isPalindrome(Node head) {
    //     // write your code here
    //     Stack<Integer> stk = new Stack<>();
    //     Node temp = head;
    //     while(temp != null){
    //         stk.push(temp.data);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     while(temp!=null){
    //         if(temp.data != stk.pop()){
    //             return false;
    //         }
    //         temp = temp.next;
    //     }
    //     return true;
    // }

    //Function to Reverse
    public static Node Reverse(Node head){
        if(head==null || head.next == null){
            return head;
        }

        Node newHead = Reverse(head.next);
        Node front = head.next;
        front.next = head;

        head.next = null;

        return newHead;

    }


    //Better Approach Recurrssion
    public static boolean isPalindrome(Node head) {

        if(head == null){
            return false;
        }

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node RevHead = Reverse(slow.next);

        while(RevHead != null){
            if(RevHead.data != head.data){
                return false;
            }
            RevHead = RevHead.next;
            head = head.next;
        }



        return true;
    }

}