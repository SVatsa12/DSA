package LinkedList;
// addFirst and addLast operations with Node return type
public class AddOperation2 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;

    public Node addFirst(Node head, int data) {
        Node newNode = new Node(data);
        size++;

        newNode.next = head;
        return newNode; // new head
    }

    public Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        AddOperation2 list = new AddOperation2();

        Node head = null;

        head = list.addFirst(head, 10);
        head = list.addLast(head, 100);
        head = list.addFirst(head, 20);
        head = list.addFirst(head, 30);
        head = list.addFirst(head, 40);
        head = list.addFirst(head, 50);

        list.printList(head);

        head = list.addLast(head, 120);

        list.printList(head);

        System.out.println("Size = " + size);
    }
}
