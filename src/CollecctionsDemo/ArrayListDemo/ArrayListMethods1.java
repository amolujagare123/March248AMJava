package CollecctionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Aarav");
        al.add("Aarushi");
        al.add("Amit");
        al.add("Ananya");
        al.add("Arun");
        al.add("Deepika");
        al.add("Gaurav");
        al.add("Ishaan");
        al.add("Neha");
        al.add("Rahul");

        System.out.println("al"+al);

        ArrayList<String> al2 = new ArrayList<>();
        System.out.println("al2"+al2);

        al2.addAll(al);
        System.out.println("al2"+al2);


    }
}
