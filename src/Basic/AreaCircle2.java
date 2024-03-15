package Basic;

import java.util.Scanner;

public class AreaCircle2 {
    public static void main(String[] args) {

        double r = 34;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius=");
        r = sc.nextDouble();

        area = 3.14 * r * r;

       // System.out.println(area);
        System.out.println("area=" + area);

    }
}
