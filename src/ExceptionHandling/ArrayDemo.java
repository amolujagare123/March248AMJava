package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 98;
            a[1] = 18;
            a[2] = 28;
            a[3] = 38;
            a[4] = 48;
            a[5] = 48;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
        }

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
