package LinkedList.DoublyLL;

public class InsertAtSpecificIndex {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node InsertAtPos(Node head,int k,int idx){
        //step1:create a new node
        Node newnode=new Node(k);
        int i=0;
        Node temp=head;

        // Step 2: Traverse to the node just before the insertion position
        while(temp!=null && i<idx-1){
            temp=temp.next;
            i++;
        }
        // If position is invalid, return original list
        if(temp==null) return head;

        // Step 3: Connect new node with the next node
        newnode.next=temp.next;

         // Step 4: If next node exists, update its prev pointer
        if(temp.next!=null){
            temp.next.prev=newnode;
        }
        // Step 5: Connect current node to the new node
        temp.next = newnode;

        // Step 6: Set new node's prev pointer
        newnode.prev = temp;
        return head;
    }
        public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {
         // Creating DLL: 10 <-> 20 <-> 30 <-> 40

        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original DLL:");
        display(head);

        // Insert 25 after index 1 (after node 20)
        head = InsertAtPos(head, 25, 2);

        System.out.println("After Insertion:");
        display(head);
    }
}
