package LinkedList;
public class ReturnNthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int getKthNodeFromLast(Node head,int k){
        Node slow=head;
        Node fast=head;
        //Step1:Traverse using fast pointer to k-th node

        /*
         * STEP 1:
         * Move fast pointer k steps ahead.
         *
         * This creates a gap of exactly k nodes between
         * fast and slow.
         *
         * Example:
         * List: 1 -> 2 -> 3 -> 4 -> 5
         * k = 2
         *
         * slow = 1
         * fast = 3
         */
        for(int i=0;i<k;i++){
            if(fast==null){
                return -1;
            }
            fast=fast.next;
        }
 /*
         * STEP 2:
         * Move both pointers together until fast reaches null.
         *
         * Since the gap between them is k nodes,
         * when fast reaches the end,
         * slow will automatically be at the Kth node from the end.
         */
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        /*
         * STEP 3:
         * slow is now pointing to the Kth node from the end.
         * Return its value.
         */

        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);

        int ans = getKthNodeFromLast(head, 2);
        System.out.println("2nd node from end = " + ans);
        
        int ans2=getKthNodeFromLast(head, 8);
        System.out.println("8th node from end = " + ans2);
    
    }
}
