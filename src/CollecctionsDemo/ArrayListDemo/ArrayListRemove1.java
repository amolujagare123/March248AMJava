package CollecctionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("Aarav");
        al.add("Aarushi");
        al.add("Amit");
        al.add("Ananya");
        al.add("Neha");
        al.add("Rahul");

        System.out.println(al);

       // al.remove(2);
        al.remove("Rahul");

        System.out.println(al);


    }
}
