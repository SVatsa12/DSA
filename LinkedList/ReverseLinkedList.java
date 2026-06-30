package LinkedList;

public class ReverseLinkedList {
    public  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node reverseLinkedList(Node head){
        if(head==null){
            return null;
        }
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList rl=new ReverseLinkedList();
        rl.head=rl.new Node(10);
        rl.head.next=rl.new Node(20);
        rl.head.next.next=rl.new Node(30);
        rl.head.next.next.next=rl.new Node(40);
        ReverseLinkedList.Node res=rl.reverseLinkedList(rl.head);
        while(res!=null){
            System.out.print(res.data+"->");
            res=res.next;
        }
    }
}
