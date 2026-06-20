package LinkedList;

/*
Note: If the number of nodes is not a multiple of k then the left-out nodes at the end, should be considered as a group and must be reversed.
*/
public class ReverseKGroup2 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverseKgroups2(Node head, int k) {

        // step1:if head is null,return null
        if (head == null)
            return null;

        // step2:Reverse the LL and keep track of count to be less than k
        Node prev = null;
        Node curr = head;
        Node next = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        // We recursively reverse the remaining nodes starting from curr.
        // The returned head of that reversed part is attached to head.next.
        // If curr is null, there are no nodes left to process.
        if (curr != null) {
            head.next = reverseKgroups2(curr, k);
        }
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

        ReverseKGroup2 list = new ReverseKGroup2();

        // Create: 1 -> 2 -> 3 -> 4 -> 5
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list.new Node(5);

        System.out.println("Original List:");
        list.printList(head);

        int k = 3;

        head = list.reverseKgroups2(head, k);

        System.out.println("After Reversing in Groups of " + k + ":");
        list.printList(head);
    }
}
