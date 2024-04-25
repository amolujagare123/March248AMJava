package CollecctionsDemo.ArrayListDemo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDisplay {

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

        System.out.println("=====  Direct print =====");
        System.out.println(al);

        System.out.println("size="+al.size());
        System.out.println(al.get(4));

        System.out.println("=====  This is using for loop =====");
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("=====  This is using for each loop =====");

        for (String str:al)
            System.out.println(str);

        System.out.println("=====  This is using Iterator =====");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
