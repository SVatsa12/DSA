package LinkedList;

public class SeggregatonOfNodesbaseOnIndex {
    public  class ListNode {
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next=null;     
        }
    }
    public ListNode head;
    public ListNode SeggregateNodes(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
    public void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    
    public static void main(String[] args) {
        SeggregatonOfNodesbaseOnIndex ll=new SeggregatonOfNodesbaseOnIndex();
        ll.head=ll.new ListNode(10);
        ll.head.next=ll.new ListNode(20);
        ll.head.next.next=ll.new ListNode(30);
        ll.head.next.next.next=ll.new ListNode(40);
        ll.head.next.next.next.next=ll.new ListNode(50);
        System.out.println("Original List:");
        ll.printList(ll.head);
        ll.head = ll.SeggregateNodes(ll.head);
        System.out.println("After Segregation:");
        ll.printList(ll.head);
    }
}
