package LinkedList;
// STEP 1:
// Insert copy nodes between originals
// A -> B -> C
// A -> A' -> B -> B' -> C -> C'

// STEP 2:
// Set random pointers
// copy.random = original.random.next

// STEP 3:
// Separate the two lists
// Restore original list
// Extract copied list

// Remember:
// INSERT -> RANDOM -> SEPARATE
public class CopyLLwithRandomPointers {
    class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    }
    public Node CopyLL(Node head){
        if(head==null){
            return null;
        }
        //step1
        Node temp=head;
        while(temp!=null){
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=copy.next;
        }
        //step2
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
              // Move only through original nodes
            temp=temp.next.next;
        }
        Node dummy=new Node(0);
        Node copycurr=dummy;
        temp=head;
        while(temp!=null){
            // Copy node next to current original node
            Node copy = temp.next;

            // Restore original list
            temp.next = copy.next;

            // Add copy node to copied list
            copycurr.next = copy;
            copycurr = copy;

            // Move to next original node
            temp = temp.next;
        }
        return dummy.next;
    }
        public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.val : -1;

            System.out.println(
                "Node = " + temp.val +
                " , Random = " + randomVal
            );

            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        CopyLLwithRandomPointers obj = new CopyLLwithRandomPointers();

        // Create nodes
        Node n1 = obj.new Node(1);
        Node n2 = obj.new Node(2);
        Node n3 = obj.new Node(3);
        Node n4 = obj.new Node(4);

        // Next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Random pointers
        n1.random = n3; // 1 -> 3
        n2.random = n1; // 2 -> 1
        n3.random = n4; // 3 -> 4
        n4.random = n2; // 4 -> 2

        System.out.println("Original List:");
        printList(n1);

        Node copiedHead = obj.CopyLL(n1);

        System.out.println("\nCopied List:");
        printList(copiedHead);

    }
}
