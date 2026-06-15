package LinkedList;

public class StartingPointofCycle {
    public  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public Node StartingPoint(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                //reset the slow
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        StartingPointofCycle ll = new StartingPointofCycle();

        Node n1 = ll.new Node(10);
        Node n2 = ll.new Node(20);
        Node n3 = ll.new Node(30);
        Node n4 = ll.new Node(40);
        Node n5 = ll.new Node(50);
        Node n6 = ll.new Node(60);
        Node n7 = ll.new Node(70);

        ll.head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        n7.next = n3;

        Node start = ll.StartingPoint(ll.head);

        if (start != null) {
            System.out.println("Starting point of cycle: " + start.data);
        } else {
            System.out.println("No cycle present");
        }
    }
}
