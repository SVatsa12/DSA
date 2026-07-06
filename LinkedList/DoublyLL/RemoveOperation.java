package LinkedList.DoublyLL;

public class RemoveOperation {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node removeFirst(){
            if(head==null){
                System.out.println("LL is empty");
                return null;
            }
            if(head.next==null){
                head=null;
                return null;
            }
            head=head.next;
            head.prev=null;
            return head;
        }
    public static Node removeLast(){
        if(head==null || head.next==null){
            return head=null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.prev=null;
        temp.next=null;
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
 // Create DLL: 10 <-> 20 <-> 30
    head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);

    // Connect nodes
    head.next = second;
    second.prev = head;

    second.next = third;
    third.prev = second;

    System.out.println("Original DLL:");
    printDLL(head);

    // Remove first node
    removeFirst();
    System.out.println("After removeFirst():");
    printDLL(head);

    // Remove last node
    removeLast();
    System.out.println("After removeLast():");
    printDLL(head);

    // Remove last node again
    removeLast();
    System.out.println("After removeLast() again:");
    printDLL(head);
    }
}
