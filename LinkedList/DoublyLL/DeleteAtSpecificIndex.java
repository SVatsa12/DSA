package LinkedList.DoublyLL;

public class DeleteAtSpecificIndex {
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

    // 1 based indexing
    public static Node DeleteAtPos(Node head, int x) {
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        Node temp = head;
        int i = 1;
        while (i < x - 1) {
            temp = temp.next;
            i++;
        }
        // Delete xth node
        temp.next = temp.next.next;
        // Fix prev link

        if (temp.next != null) {
            // Update its prev pointer to point to temp,
            // since the original node between them has been deleted
            temp.next.prev = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        // Creating DLL: 10 <-> 20 <-> 30 <-> 40 <-> 50

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        // Linking nodes
        head.next = second;

        second.prev = head;
        second.next = third;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;
        fourth.next = fifth;

        fifth.prev = fourth;

        System.out.println("Original Doubly Linked List:");
        printDLL(head);

        // Delete at position 3 (node 30)
        head = DeleteAtPos(head, 3);

        System.out.println("After deleting position 3:");
        printDLL(head);

        // Delete first node
        head = DeleteAtPos(head, 1);

        System.out.println("After deleting position 1:");
        printDLL(head);
    }
}
