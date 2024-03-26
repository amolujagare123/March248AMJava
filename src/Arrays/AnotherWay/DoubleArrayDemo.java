package Arrays.AnotherWay;

public class DoubleArrayDemo {

    public static void main(String[] args) {
        double[]  a = {12.34,23.45,34.56,45.67,78.90};

       /* for (int i=0 ; i<5 ;i++ )
           System.out.println(a[i]);*/

        for (double x:a)
        {
            System.out.println(x);
        }
    }
}
