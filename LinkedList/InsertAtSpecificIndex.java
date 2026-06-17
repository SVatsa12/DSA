package LinkedList;
//insert node at a specific index
public class InsertAtSpecificIndex {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public Node insertPos(Node head, int pos, int val) {
        Node newnode = new Node(val);

        if (pos == 1) {
            newnode.next = head;
            return newnode;
        }

        int i = 1;
        Node temp = head;

        while (temp.next != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;

        return head;
    }

    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertAtSpecificIndex list = new InsertAtSpecificIndex();

        // Create: 1 -> 2 -> 3 -> 4
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);

        System.out.print("Original List: ");
        list.printList(head);

        // Insert 10 at position 3
        head = list.insertPos(head, 3, 10);

        System.out.print("After Insertion: ");
        list.printList(head);
    }
}