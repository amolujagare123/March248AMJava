package CollecctionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("Aarav");
        al.add("Aarushi");
        al.add("Amit");
        al.add("Ananya");
        al.add("Neha");
        al.add("Rahul");

        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Ananya");
        al2.add("Neha");
        al2.add("Rahul");
        al2.add("xyz");
        al2.add("abc");
        al2.add("pqr");

        System.out.println(al2);

        al2.removeAll(al);
        System.out.println(al2);

    }
}
