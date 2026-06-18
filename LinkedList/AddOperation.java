package LinkedList;


//addFirst operation  and addLast Operation using head and tail
public class AddOperation {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    //insert at the end using node head
    public void addLast2(int data){
        Node newnode=new Node(data);
        size++;
        while(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        
    }
    public  void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
         System.out.println("null");
    }
    public static void main(String[] args) {
        AddOperation ll=new AddOperation();
        ll.addFirst(10);
        ll.addLast(100);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addLast(80);
        ll.printList();
        ll.addLast2(120);
        ll.printList();
        System.out.println(ll.size);
    }
}
