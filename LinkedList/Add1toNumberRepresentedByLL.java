package LinkedList;
// Example: 99 + 1

// Step 1: Reverse the LinkedList
//
// Original:
// 9 -> 9
//
// After reverse:
// 9 -> 9

// Step 2: Add carry
//
// carry = 1 (because we need to add 1)
//
// Current node = first 9
//
// sum = 9 + 1 = 10
// digit = 10 % 10 = 0
// carry = 10 / 10 = 1
//
// List becomes:
// 0 -> 9

// Step 3: Propagate carry if needed
//
// Move to next node.
//
// Current node = second 9
//
// sum = 9 + 1 = 10
// digit = 0
// carry = 1
//
// List becomes:
// 0 -> 0
//
// Carry still remains but there is no next node.
//
// Since curr.next == null and carry > 0,
// create a new node.
//
// List becomes:
// 0 -> 0 -> 0
//
// Move to the newly created node.
//
// Current node = new node (0)
//
// sum = 0 + 1 = 1
// digit = 1
// carry = 0
//
// List becomes:
// 0 -> 0 -> 1
//
// Carry becomes 0, so propagation stops.

// Step 4: Reverse again to restore original order
//
// Before reverse:
// 0 -> 0 -> 1
//
// After reverse:
// 1 -> 0 -> 0
//
// Final Answer = 100
public class Add1toNumberRepresentedByLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node addNode(Node head) {
        // Step1:Reverse the LinkedList
        head = reverse(head);

        Node curr = head;
        int carry = 1;

        // Step 2: Add carry
        while (curr != null && carry > 0) {
            int sum = curr.data + carry;
            // Store the digit part
            curr.data = sum % 10;
            // store the carry part
            carry = sum / 10;

            // Step3:Propagate carry if needed.

            // If carry remains and next node doesn't exist,
            // create a new node.
            while (carry > 0 && curr.next == null) {
                curr.next = new Node(0);
            }
            curr = curr.next;
        }

        // step4:Reverse again to restore original order
        return reverse(head);

    }

    public static void printList(Node head) {
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
        // Create: 9 -> 9
    Node head = new Node(9);
    head.next = new Node(9);

    System.out.print("Original List: ");
    printList(head);

    head = addNode(head);

    System.out.print("After Adding 1: ");
    printList(head);
    }

}
