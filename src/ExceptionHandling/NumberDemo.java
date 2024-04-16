package ExceptionHandling;

public class NumberDemo {

    // check number is between 1 - 10

    void checkNumber(int i)
    {
        if(i<=10 && i>=1)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {
        NumberDemo ob = new NumberDemo();

        int a = 23;
        System.out.println("a="+10);
        System.out.println("Checking number");

        ob.checkNumber(a);

        System.out.println("This was the result");
        System.out.println("End of the program");

    }
}
