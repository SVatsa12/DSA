package LinkedList.DoublyLL;

public class DeleteAllOccurences {
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
        System.out.print("null-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node delAllOccurences(Node head, int x) {
        Node temp = head;
        while (temp != null) {

            // If current node contains the value to be deleted
            if (temp.data == x) {

                // Store next node before deleting current node
                // so that traversal can continue afterwards
                Node nextnode = temp.next;

                // If the node to be deleted is the head,
                // move head to the next node
                if (temp == head) {
                    head = head.next;
                }

                // Update the previous node's next pointer
                // to skip the current node
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }

                // Update the next node's prev pointer
                // to skip the current node
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                // Move to the next node and continue checking
                temp = nextnode;
            } else {

                // Current node does not contain x,
                // so simply move to the next node
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        // 1 <-> 2 <-> 3 <-> 2 <-> 4 <-> 2

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(4);
        Node sixth = new Node(2);

        // Connecting nodes
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        fifth.next = sixth;
        sixth.prev = fifth;

        System.out.println("Original DLL:");
        printDLL(head);

        int x = 2;

        head = delAllOccurences(head, x);

        System.out.println("\nDLL after deleting all occurrences of " + x + ":");
        printDLL(head);
    }
}
