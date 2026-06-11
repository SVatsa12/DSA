package LinkedList;

public class DeleteAtIndex {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static Node DeleteAtSpecificIndex(Node head, int idx) {
        if (head == null) {
            return null;
        }
        // index=0 case
        if (idx == 0) {
            head = head.next;
            return head;
        }
        int i = 0;
        Node temp = head;
        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
     public static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before Deletion:");
        printLL(head);

        int idx = 2; // delete node at index 2 (value 30)

        head = DeleteAtSpecificIndex(head, idx);

        System.out.println("After Deletion:");
        printLL(head);
    }
}
