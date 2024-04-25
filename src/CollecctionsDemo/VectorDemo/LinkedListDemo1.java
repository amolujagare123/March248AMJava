package CollecctionsDemo.VectorDemo;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        System.out.println("capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 0

        v.add("Aarav");
        v.add("Aarushi");
        v.add("Amit");
        v.add("Ananya");
        v.add("Neha");
        v.add("Rahul");
        v.add("Amit");
        v.add("Ananya");
        v.add("Neha");
        v.add("Rahul");
        v.add("Rahul");
        v.add("Aarav");
        v.add("Aarushi");
        v.add("Amit");
        v.add("Ananya");
        v.add("Neha");
        v.add("Rahul");
        v.add("Amit");
        v.add("Ananya");
        v.add("Neha");
        v.add("Neha");

        System.out.println("capacity="+v.capacity()); // 40
        System.out.println("size="+v.size()); // 21
        System.out.println(v);


    }
}
