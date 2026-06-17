package LinkedList;
public class PalindromeCheckLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean IsPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        //Step1:find Middle node
        Node midnode=findMid(head);
        //step2:Reverse the other half(from the midnode to the end)
        Node prev=null;
        Node curr=midnode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //step3:Compare left half with right half
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(2);
    head.next.next.next.next = new Node(1);

    boolean result = IsPalindrome(head);

    System.out.println("Is Palindrome: " + result);
    }
}
