package LinkedList;

public class LengthofLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }  
    }
    static Node head;
    public static void CalLength(){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        System.out.println("Length of LinkedList:"+cnt);
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        CalLength();

    }
}
