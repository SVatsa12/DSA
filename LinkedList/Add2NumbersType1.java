package LinkedList;

public class Add2NumbersType1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node addTwo(Node l1, Node l2) {
        // step1:create a dummy node
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry = 0;
          // Continue while:
            // 1. List 1 has nodes left, OR
            // 2. List 2 has nodes left, OR
            // 3. There is a carry remaining
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            // Extract the digit to store in the current node.
            // Example: 15 % 10 = 5
            int digit = sum % 10;

             // Compute carry for the next iteration.
            // Example: 15 / 10 = 1
            carry = sum / 10;

             // Create a new node with the calculated digit.
            curr.next = new Node(digit);

            // Move curr to the newly created node.
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Add2NumbersType1 list = new Add2NumbersType1();

        // First number: 342 = 2 -> 4 -> 3
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // Second number: 465 = 5 -> 6 -> 4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);


        //the sum is:342+465=807,when converted to nodes:708
        //Result:708
        Node result = list.addTwo(l1, l2);

        
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
