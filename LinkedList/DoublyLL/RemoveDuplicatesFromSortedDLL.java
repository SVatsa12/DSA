package LinkedList.DoublyLL;

public class RemoveDuplicatesFromSortedDLL {
    public class Node {
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
            System.out.print("null<->");
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node removeDuplicateNodes(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                Node duplicate = temp.next;
                temp.next = duplicate.next;
                if (duplicate.next != null) {
                    duplicate.next.prev = temp;
                }
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedDLL list = new RemoveDuplicatesFromSortedDLL();

        Node head = list.new Node(1);
        head.next = list.new Node(1);
        head.next.prev = head;

        head.next.next = list.new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = list.new Node(3);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = list.new Node(4);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = list.new Node(5);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        System.out.println("Original DLL:");
        printDLL(head);

        head = list.removeDuplicateNodes(head);

        System.out.println("DLL after removing duplicates:");
        printDLL(head);
    }
}
