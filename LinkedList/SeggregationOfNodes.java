package LinkedList;
//odd nodes followed by even nodes
/* 
Original Linked List:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
After Segregation:
2 -> 4 -> 6 -> 1 -> 3 -> 5 -> null
*/
public class SeggregationOfNodes {
    public  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  Node head;
    public Node divideNode(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node evenhead=null,eventail=null;
        Node oddhead=null,oddtail=null;
        Node current=head;
        while(current!=null){
            //even case
            if(current.data%2==0){
                //empty wla case
                if(evenhead==null){
                    evenhead=current;
                    eventail=current;
                }else
                    //non empty even case
                    {
                    eventail.next=current;
                    eventail=current;
                }
                //odd case
            }else{
                //empty odd case
                if(oddhead==null){
                    oddhead=current;
                    oddtail=current;
    
                }else
                    //non empty odd case
                    {
                    oddtail.next=current;
                    oddtail=current;
                }
            }
            current=current.next;
        }
        //only odd nodes
        if(evenhead==null) return oddhead;

        //for only even nodes
        if(oddhead==null) return evenhead;

        //if both present,combine kro
        eventail.next=oddhead;
        oddtail.next=null;
        return evenhead;

    } 
    public static void main(String[] args) {
         SeggregationOfNodes list = new SeggregationOfNodes();

    // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
    list.head = list.new Node(1);
    list.head.next = list.new Node(2);
    list.head.next.next = list.new Node(3);
    list.head.next.next.next = list.new Node(4);
    list.head.next.next.next.next = list.new Node(5);
    list.head.next.next.next.next.next = list.new Node(6);

    System.out.println("Original Linked List:");
    Node temp = list.head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");

    Node newHead = list.divideNode(list.head);

    System.out.println("After Segregation:");
    temp = newHead;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
    }
}
