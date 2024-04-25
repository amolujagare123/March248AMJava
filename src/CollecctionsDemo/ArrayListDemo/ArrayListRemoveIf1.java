package CollecctionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Aarav");
        al.add("Aarushi");
        al.add("Amit");
        al.add("Ananya");
        al.add("Neha");
        al.add("Rahul");

        System.out.println(al);

        // 1. remove elements which starts with 'A'
        // 2. remove elements whose length
        // is 5 or less than 5

     //   al.removeIf(str -> ( str.startsWith("A")) );
        al.removeIf(str -> ( str.length()<=5) );

        System.out.println(al);

    }
}
