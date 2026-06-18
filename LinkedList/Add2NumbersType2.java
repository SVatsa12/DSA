package LinkedList;

public class Add2NumbersType2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head) {
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

    public Node addTwo(Node head1, Node head2) {

        //step1:reverse the head
        head1 = reverse(head1);
        head2 = reverse(head2);

        //step2:create dummy nodes and perform addition
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry = 0;
        while (head1 != null || head2 != null || carry > 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;

            //Step3:Create nodes if carry exists
            curr.next = new Node(digit);
            curr = curr.next;
        }
        // Remove leading zeros if they exist
        // Example: 000123 -> 123
        // Stop at last node so we don't remove all digits

        // step4:Reverse back into the original
        Node ans = reverse(dummy.next);
        while (ans != null && ans.data == 0 && ans.next != null) {
            ans = ans.next;
        }

        return ans;
    }

    public static void main(String[] args) {
    Add2NumbersType2 sol = new Add2NumbersType2();

    // First number: 456
    Node head1 = new Node(2);
    head1.next = new Node(5);
    head1.next.next = new Node(6);

    // Second number: 344
    Node head2 = new Node(1);
    head2.next = new Node(4);
    head2.next.next = new Node(2);

    // Add the two numbers
    Node result = sol.addTwo(head1, head2);

    // Print the result linked list
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
