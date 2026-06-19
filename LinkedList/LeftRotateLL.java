package LinkedList;

public class LeftRotateLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node LeftRotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int lengthofLL = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            lengthofLL++;
        }
        k = k % lengthofLL;
        if (k == 0) {
            return head;
        }
        Node curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }
        Node newhead = curr.next;
        curr.next = null;
        tail.next = head;
        return newhead;
    }

    public static void printLL(Node head) {
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println("Original List:");
        printLL(head);
        int k = 2;
        head = LeftRotate(head, k);
        System.out.println("After Left Rotation by " + k + ":");
        printLL(head);
    }
}
