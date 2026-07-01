package LinkedList.DoublyLL;

public class ArraytoDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }       
    }
    public static Node constructDLL(int arr[]){
        if(arr.length==0){
            return null;
        }
        Node head=new Node(arr[0]);
        Node tail=head;
        for(int i=1;i<arr.length;i++){
            Node newnode=new Node(arr[i]);
            //forward link
            tail.next=newnode;

            //backward link
            newnode.prev=tail;

            //move tail
            tail=newnode;
        }
        return head;
    }
        public static void printDLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data +" "+ "<-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
          int[] arr = {10, 20, 30, 40, 50};

        Node head = constructDLL(arr);

        System.out.println("Doubly Linked List:");
        printDLL(head);
    }
}
