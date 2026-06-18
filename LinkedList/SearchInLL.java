package LinkedList;

public class SearchInLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    public static boolean SearchLL(Node head,int key){
        if(head==null){
            return false;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        boolean res=SearchLL(head, 30);
        if(res){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        boolean res2=SearchLL(head, 35);
        if(res2){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}
