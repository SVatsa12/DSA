package LinkedList;

public class RightRotateLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node rotateLL(Node head,int k){
        //step1:check head,if null return head
        if(head==null || head.next==null || k==0){
            return head;
        }

        //step2:Calculate the length
        int lengthofLL=1;
        Node tail=head;
        while (tail.next!=null) {
            tail=tail.next;
            lengthofLL++;
        }
        //Step 3: Reduce Unnecessary Rotations
        k=k%lengthofLL;

        if (k == 0) {
            return head;
        }
        //Step 4:convert the list into circular list
        tail.next=head;

        //Step 6: Find New Tail
        int steps=lengthofLL-k-1;
        Node newtail=head;
        while(steps-->0){
            newtail=newtail.next;
        }
        //Step 7: Find New Head
        Node newhead=newtail.next;
        newtail.next=null;
        return newhead;

    }
        public static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Original Linked List:");
        printLL(head);
        int k = 2;
        head = rotateLL(head, k);
        System.out.println("Linked List after rotating by " + k + " positions:");
        printLL(head);
    }
}
