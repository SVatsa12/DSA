package LinkedList;

public class ArraytoLL {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    };
    public  static Node ArraytoLinkedList(int arr[]){
            if(arr.length==0){
                return null;
            }
            Node head=new Node(arr[0]);
            Node current=head;
            for(int i=1;i<arr.length;i++){
                current.next=new Node(arr[i]);
                current=current.next;
            }
            return head;
    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Node head=ArraytoLinkedList(arr);
        printLL(head);
    }
}
