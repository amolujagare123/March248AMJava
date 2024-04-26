package CollecctionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Aarav");
        s.push("Saanvi");
        s.push("Advait");
        s.push("Aadhya");
        s.push("Vihaan");
        s.push("Ananya");

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);


    }
}
