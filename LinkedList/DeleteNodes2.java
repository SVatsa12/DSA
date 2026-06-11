package LinkedList;

public class DeleteNodes2 {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public Node removeFirst() {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }
    public Node removeLast(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void main(String[] args) {

        DeleteNodes2 ll = new DeleteNodes2();

        ll.head = ll.new Node(10);
        ll.head.next = ll.new Node(20);
        ll.head.next.next = ll.new Node(30);
        ll.head.next.next.next = ll.new Node(40);
        ll.head.next.next.next.next = ll.new Node(50);

        Node newHead = ll.removeFirst();

        while (newHead != null) {
            System.out.print(newHead.data + " -> ");
            newHead = newHead.next;
        }
        System.out.println("null");

        Node newHead2=ll.removeLast();
        while(newHead2!=null){
            System.out.print(newHead2.data+"->");
            newHead2=newHead2.next;
        }
        System.out.println("null");
    }
}