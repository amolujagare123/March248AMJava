package ExceptionHandling;

public class DivisionDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 1;

        try {
            c= a / b;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
        }


        System.out.println("c="+c);
        System.out.println("End of the program");
    }
}
