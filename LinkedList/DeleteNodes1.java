package LinkedList;
//removeFirst and removeLast
public class DeleteNodes1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }   
    }
    public static Node head;
    public static void removeFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public static void removeLast() {
        Node temp=head;
        if(head==null){
            return;
        }
        //for LL with size=1 
        if(head.next==null){
            return;
        }

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return;

    }
    public static void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);
        removeFirst();
        printLL();
        removeLast();
        printLL();
    }
}
