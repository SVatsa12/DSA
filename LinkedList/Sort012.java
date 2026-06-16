package LinkedList;

public class Sort012 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node Sort(Node head){
        /*
        oneDummy → never moves, always your handle to the front
        one → walks forward, gives you the tail for stitching
         */
        Node zeroDummy=new Node(-1);
        Node oneDummy=new Node(-1);
        Node twoDummy=new Node(-1);
        Node zero=zeroDummy;
        Node one=oneDummy;
        Node two=twoDummy;
        Node curr=head;
        while (curr!=null) {
            if(curr.data==0){
                zero.next=curr;
                zero=zero.next;
            }else if(curr.data==1){
                one.next=curr;
                one=one.next;
            }else{
                two.next=curr;
                two=two.next;
            }
            curr=curr.next;
        }
        // Connect tail of 0-chain to front of 1-chain (use oneDummy.next, not one — one is the tail, oneDummy.next is the head)
       zero.next=(oneDummy.next!=null)?oneDummy.next:twoDummy.next;

       // Connect tail of 1-chain to front of 2-chain
       one.next=twoDummy.next;

       // Terminate the list (last node may still point somewhere from original list)
       two.next=null;

       // Return head of first non-empty chain (dummy nodes hold -1, so return .next)
       return (zeroDummy.next!=null)?zeroDummy.next:(oneDummy.next!=null)?oneDummy.next:twoDummy.next;
    }
        // Print Linked List
    public static void printList(Node head) {
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
                // Creating: 1 -> 2 -> 0 -> 1 -> 2 -> 0
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        System.out.print("Original List: ");
        printList(head);

        Sort012 obj = new Sort012();
        head = obj.Sort(head);

        System.out.print("Sorted List:   ");
        printList(head);

    }

}
