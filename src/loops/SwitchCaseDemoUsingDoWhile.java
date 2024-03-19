package loops;

import java.util.Scanner;

public class SwitchCaseDemoUsingDoWhile {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;

        String operation ; // sub / mult / div

        Scanner sc = new Scanner(System.in);



        String choice ;
        do {
            System.out.println("Enter your Operation=");
            operation = sc.nextLine();

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;
                default:
                    System.out.println("wrong choice / case");
                    break;
            }

            System.out.println("Do you want to continue ? (yes/no)");
            choice = sc.nextLine();
        }while (choice.equals("yes"));

    }
}
