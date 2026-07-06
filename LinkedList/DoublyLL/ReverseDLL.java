package LinkedList.DoublyLL;

public class ReverseDLL {
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

    public static void printDLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " " + "<-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node Reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        Node temp = null;
        while (current != null) {

            // swap current.prev with current.next
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // move to next node
            current = current.prev;
        }
        return temp.prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Connecting next pointers
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Connecting prev pointers
        second.prev = head;
        third.prev = second;
        fourth.prev = third;

        System.out.println("Original Doubly Linked List:");
        printDLL(head);

        // Reverse DLL
        head = Reverse(head);

        System.out.println("Reversed Doubly Linked List:");
        printDLL(head);

    }
}
