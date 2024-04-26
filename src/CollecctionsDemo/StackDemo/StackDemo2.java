package CollecctionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push("Aarav");
        s.push("Saanvi");
        s.push("Advait");
        s.push("Aadhya");
        s.push("Vihaan");
        s.push("Ananya");
        System.out.println(s.empty()); // false
        System.out.println(s);

        System.out.println(s.search("Aadhya"));
    }
}
