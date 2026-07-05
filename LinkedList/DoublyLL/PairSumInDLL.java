package LinkedList.DoublyLL;

import java.util.ArrayList;

public class PairSumInDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
            Node head) {
        // step1:create an arraylist to store ans
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (head == null) {
            return ans;
        }
        Node left = head;
        Node right = head;

        // step2:shift right to point to the last node
        while (right.next != null) {
            right = right.next;
        }
        while (left != null && right != null && left != right && right.next != null) {
            int sum = left.data + right.data;
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);

                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(7);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(10);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        int target = 11;

        ArrayList<ArrayList<Integer>> ans = findPairsWithGivenSum(target, head);

        System.out.println("Pairs with sum " + target + ":");

        for (ArrayList<Integer> pair : ans) {
            System.out.println(pair);
        }

    }
}
