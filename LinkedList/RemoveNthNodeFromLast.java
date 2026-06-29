package LinkedList;

public class RemoveNthNodeFromLast {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public Node RemoveNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        // step1 :fast pointer use krke,move n steps ahead
        /*
         * This creates a gap of exactly n nodes between fast and slow. After this loop,
         * fast is n positions ahead.
         */
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return head; // or handle according to problem statement
            }
            fast = fast.next;
        }
        // if first node remove krna ho,uske liye
        if (fast == null) {
            return head.next;
        }
        /*
         * Both pointers advance together, preserving the n-node gap. The loop stops
         * when fast.next is null — meaning fast is at the last node. At this point,
         * slow is pointing at the node just before the one you want to delete.
         * Why fast.next != null and not fast != null? Because you need slow to land
         * before the target, not at it. You can't delete a node without a reference to
         * its predecessor.
         */

        /*
         * Move both pointers one step at a time while keeping
         * the gap of n nodes between them.
         *
         * The loop stops when fast reaches the last node
         * (i.e., fast.next becomes null).
         *
         * At that moment, slow will be pointing to the node
         * just BEFORE the node that needs to be deleted.
         */
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Deleting or skipping the nth node
        slow.next = slow.next.next;
        return head;

    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveNthNodeFromLast rn = new RemoveNthNodeFromLast();
        rn.head = rn.new Node(10);
        rn.head.next = rn.new Node(20);
        rn.head.next.next = rn.new Node(30);
        rn.head.next.next.next = rn.new Node(40);
        rn.head.next.next.next.next = rn.new Node(50);

        System.out.println("Original List:");
        printList(rn.head);

        rn.head = rn.RemoveNthFromEnd(rn.head, 2);

        System.out.println("After Removing 2nd Node From End:");
        printList(rn.head);

    }
}
