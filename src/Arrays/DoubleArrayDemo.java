package Arrays;

public class DoubleArrayDemo {

    public static void main(String[] args) {
        double[]  a = new double[5];

        a[0] = 23.78;
        a[1] = 43.44;
        a[2] = 56.11;
        a[3] = 11.90;
        a[4] = 56.34;

       /* for (int i=0 ; i<5 ;i++ )
           System.out.println(a[i]);*/

        for (double x:a)
        {
            System.out.println(x);
        }
    }
}
