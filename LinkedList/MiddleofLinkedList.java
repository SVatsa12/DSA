package LinkedList;
//finding middle node using tortoise-hare Method(slow and fast)
public class MiddleofLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node MiddleofLL(Node head){
        if(head==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        MiddleofLinkedList ll=new MiddleofLinkedList();
        ll.head=ll.new Node(10);
        ll.head.next=ll.new Node(20);
        ll.head.next.next=ll.new Node(30);
        ll.head.next.next.next=ll.new Node(40);
        ll.head.next.next.next.next=ll.new Node(50);
        MiddleofLinkedList.Node middle = ll.MiddleofLL(ll.head);
        System.out.println("Middle Node: " + middle.data);

    }
}
