package LinkedList;

public class LengthOfLoop {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static int LoopLength(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(slow==fast){
                int count=1;
                Node temp=slow.next;
                while(temp!=slow){
                    count++;
                    temp=temp.next;
                }
                return count;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        Node n7 = new Node(70);
        head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;


    //cycle formation
        n7.next=n2;
        System.out.println("Length of Loop:"+LoopLength(head));
    }
}
