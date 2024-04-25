package CollecctionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListMethods3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("Aarav");
        al.add("Aarushi");
        al.add("Amit");
        al.add("Ananya");
        al.add("Neha");
        al.add("Rahul");

        System.out.println(al);

        al.set(4,"xyz");

        System.out.println(al);


    }
}
