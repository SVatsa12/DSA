package LinkedList;
//type1:k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// Input: head = [1,2,3,4,5], k = 2
// Output: [2,1,4,3,5]

public class ReverseKGroups {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverseKgroups(Node head, int k) {
        // Step 1: Check whether at least k nodes are available.
        // If fewer than k nodes remain, return the list as it is.
        Node temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }
        // Step 2: Reverse the first k nodes.

        Node prev = null;
        Node curr = head;
        for (int i = 0; i < k; i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Recursively reverse the remaining nodes
        // and connect them to the tail of the current group.
        head.next = reverseKgroups(curr, k);
        return prev;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ReverseKGroups list = new ReverseKGroups();

        // Create: 1 -> 2 -> 3 -> 4 -> 5
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list.new Node(5);

        System.out.println("Original List:");
        list.printList(head);

        int k = 3;

        head = list.reverseKgroups(head, k);

        System.out.println("After Reversing in Groups of " + k + ":");
        list.printList(head);
    }
}
