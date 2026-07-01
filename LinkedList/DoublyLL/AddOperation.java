package LinkedList.DoublyLL;

public class AddOperation {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static Node addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            return head = tail = newnode;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        return head;
    }
    public static Node addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            return head=tail=newnode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        return head;
    }
    public static void printDLL(Node head){
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        addFirst(30);
        addFirst(20);
        addFirst(10);
        printDLL(head);
        addLast(50);
        addLast(60);
        addLast(70);
        printDLL(head);
    }
}
