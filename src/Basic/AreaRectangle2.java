package Basic;

import java.util.Scanner;

public class AreaRectangle2 {
    public static void main(String[] args) {

        int l = 34;
        int b = 89;
        int area;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter value of l=");
        l=sc.nextInt();

        System.out.println("enter value of b=");
        b=sc.nextInt();


        area = l * b;

       // System.out.println(area);
        System.out.println("area=" + area);

    }
}
