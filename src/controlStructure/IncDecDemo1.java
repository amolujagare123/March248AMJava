package controlStructure;

public class IncDecDemo1 {

    public static void main(String[] args) {
        int a = 10;

        System.out.println(a); // 10
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a);// 12
        System.out.println(a); // 12

        /*a++ / a - - : First, the statement is executed
        then increment or decrement happens

        ++a / - - a  : First increment or decrement happens
        then the statement is executed
        */

    }
}
