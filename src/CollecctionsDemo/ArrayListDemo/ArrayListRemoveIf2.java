package CollecctionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {


    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();

        al.add(101);
        al.add(222);
        al.add(333);
        al.add(444);
        al.add(555);
        al.add(666);
        al.add(777);
        al.add(888);

        System.out.println(al);
        // remove all the odd numbers
        al.removeIf(i -> (i%2 != 0) );

        System.out.println(al);





    }
}
