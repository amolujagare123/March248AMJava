package CollecctionsDemo.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Aarav");
        ll.add("Aarushi");
        ll.add("Amit");
        ll.add("Ananya");
        ll.add("Neha");
        ll.add("Rahul");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
