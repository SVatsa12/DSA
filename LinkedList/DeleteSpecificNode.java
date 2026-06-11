package LinkedList;

public class DeleteSpecificNode {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    //method 1:with void return type
    public void DeleteNthNode(Node node ){
        if(node==null || node.next==null){
            return;
        }
        node.data=node.next.data;
        node.next=node.next.next;
    }
    //Method 2:with Node return type
    public Node DeleteNthNode2(Node node){
        if(node==null || node.next==null){
            return null;
        }
        node.data=node.next.data;
        node.next=node.next.next;
        return node;
    }
    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteSpecificNode ll=new DeleteSpecificNode();
        ll.head=ll.new Node(10);
        ll.head.next=ll.new Node(20);
        ll.head.next.next=ll.new Node(30);
        ll.head.next.next.next=ll.new Node(40);
        ll.head.next.next.next.next=ll.new Node(50);
        Node nodeToDelete = ll.head.next.next;
        ll.DeleteNthNode(nodeToDelete);
        ll.printLL();
        Node nodeToDelete2 = ll.head.next;
        Node result = ll.DeleteNthNode2(nodeToDelete2);
        ll.printLL();
    }
}
