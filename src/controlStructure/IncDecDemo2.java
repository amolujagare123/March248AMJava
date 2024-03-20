package controlStructure;

public class IncDecDemo2 {

    public static void main(String[] args) {
        int a = 10;

        System.out.println(a); // 10
        System.out.println(a--); // 10
        System.out.println(a); // 9
        System.out.println(--a);// 8
        System.out.println(a); // 8

        /*a++ / a -- : First, the statement is executed
        then increment or decrement happens

        ++a / -- a  : First increment or decrement happens
        then the statement is executed
        */

    }
}
