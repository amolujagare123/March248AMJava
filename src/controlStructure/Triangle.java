package controlStructure;

public class Triangle {
    public static void main(String[] args) {
        int a = 30;
        int b = 60;
        int c = 90;

        if(a+b+c == 180 && a>0 && b>0 && c>0) {
            if (a == b && b == c)
                System.out.println("Equilateral triangle");

            if (a != b && b != c && c != a)
                System.out.println("Scalene triangle");

            if (a == 90 || b == 90 || c == 90)
                System.out.println("right angled triangle");

            if ((a == b & b != c) || (b == c && c != a) || (c == b && b != a))
                System.out.println("Isosceles triangle");
        }
        else
            System.out.println("This is not a triangle");

    }
}
