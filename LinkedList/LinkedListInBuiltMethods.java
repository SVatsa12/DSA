package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInBuiltMethods {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // =======================
        // Adding Elements
        // =======================
        list.add(20);
        list.add(30);
        list.addFirst(10);
        list.addLast(40);
        list.offer(50);

        System.out.println("After Adding Elements:");
        System.out.println(list);

        // =======================
        // Accessing Elements
        // =======================
        System.out.println("\nFirst Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at Index 2: " + list.get(2));

        // =======================
        // Updating Element
        // =======================
        list.set(2, 100);

        System.out.println("\nAfter Updating Index 2:");
        System.out.println(list);

        // =======================
        // Searching
        // =======================
        System.out.println("\nContains 100? " + list.contains(100));
        System.out.println("Index of 100: " + list.indexOf(100));
        System.out.println("Last Index of 100: " + list.lastIndexOf(100));

        // =======================
        // Removing Elements
        // =======================
        list.removeFirst();
        list.removeLast();
        list.remove(Integer.valueOf(30));

        System.out.println("\nAfter Removing Elements:");
        System.out.println(list);

        // =======================
        // Queue Operations
        // =======================
        list.offer(200);
        list.offer(300);

        System.out.println("\nQueue Operations:");
        System.out.println("Queue: " + list);
        System.out.println("Peek: " + list.peek());
        System.out.println("Poll: " + list.poll());
        System.out.println("After Poll: " + list);

        // =======================
        // Stack Operations
        // =======================
        list.push(500);
        list.push(600);

        System.out.println("\nStack Operations:");
        System.out.println("Stack: " + list);
        System.out.println("Peek: " + list.peek());
        System.out.println("Pop: " + list.pop());
        System.out.println("After Pop: " + list);

        // =======================
        // Size and Empty
        // =======================
        System.out.println("\nSize: " + list.size());
        System.out.println("Is Empty? " + list.isEmpty());

        // =======================
        // For-each Loop
        // =======================
        System.out.println("\nUsing For-each Loop:");
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // =======================
        // Iterator
        // =======================
        System.out.println("\n\nUsing Iterator:");
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // =======================
        // Descending Iterator
        // =======================
        System.out.println("\n\nUsing Descending Iterator:");
        Iterator<Integer> rev = list.descendingIterator();

        while (rev.hasNext()) {
            System.out.print(rev.next() + " ");
        }

        // =======================
        // Convert to Array
        // =======================
        Integer[] arr = list.toArray(new Integer[0]);

        System.out.println("\n\nArray Elements:");
        for (Integer x : arr) {
            System.out.print(x + " ");
        }

        // =======================
        // Clear List
        // =======================
        list.clear();

        System.out.println("\n\nAfter Clear:");
        System.out.println("List: " + list);
        System.out.println("Is Empty? " + list.isEmpty());
    }
} 
    

