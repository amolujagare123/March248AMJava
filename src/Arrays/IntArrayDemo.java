package Arrays;

public class IntArrayDemo {

    public static void main(String[] args) {
        int[]  a = new int[5];

        a[0] = 23;
        a[1] = 43;
        a[2] = 56;
        a[3] = 11;
        a[4] = 56;

        int l = a.length;

       /* for (int i=0 ; i<5 ;i++ )
           System.out.println(a[i]);*/

        /*for (int i=0 ; i<a.length ;i++ )
            System.out.println(a[i]);*/

        for(int x: a)
        {
            System.out.println(x);
        }
    }
}
