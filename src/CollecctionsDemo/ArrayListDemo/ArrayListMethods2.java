package CollecctionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println("place 1 ="+al.isEmpty()); // true

        al.add("Aarav");
        al.add("Aarushi");
        al.add("Amit");
        al.add("Ananya");
        al.add("Neha");
        al.add("Rahul");
        System.out.println("place 2 ="+al.isEmpty()); // false

        System.out.println("al before clear():"+al);

        al.clear();

        System.out.println("place 3 ="+al.isEmpty()); // true

        System.out.println("al after clear():"+al);




    }
}
