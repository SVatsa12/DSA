package LinkedList;

public class IntersectionOfTwoNodes {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node getIntersection(Node head1,Node head2){
        if(head1==null|| head2==null){
            return null;
        }
        Node p1=head1;
        Node p2=head2;
        while(p1!=p2){
            p1=(p1==null)?head2:p1.next;
            p2=(p2==null)?head1:p2.next;
        }
        return p1;
    }
    public static void main(String[] args) {

    // Common part
    Node common = new Node(8);
    common.next = new Node(9);
    common.next.next = new Node(10);

    // First Linked List: 1 -> 2 -> 3 -> 8 -> 9 -> 10
    Node head1 = new Node(1);
    head1.next = new Node(2);
    head1.next.next = new Node(3);
    head1.next.next.next = common;

    // Second Linked List: 4 -> 5 -> 8 -> 9 -> 10
    Node head2 = new Node(4);
    head2.next = new Node(5);
    head2.next.next = common;

    Node intersection = getIntersection(head1, head2);

    if (intersection != null) {
        System.out.println("Intersection Node Data: " + intersection.data);
    } else {
        System.out.println("No Intersection Found");
    }
    }
}
