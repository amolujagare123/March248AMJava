package Arrays.TwoDArray;

public class IntTwoDArrayDemo1 {
    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 12;
        a[0][1] = 13;
        a[0][2] = 14;

        a[1][0] = 22;
        a[1][1] = 23;
        a[1][2] = 24;

        a[2][0] = 52;
        a[2][1] = 63;
        a[2][2] = 74;

        a[3][0] = 82;
        a[3][1] = 93;
        a[3][2] = 44;

        int row = a.length; // 4
        int col = a[0].length; // 3

        System.out.println("row="+row);
        System.out.println("col="+col);

       /* for (int i=0;i<4;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }*/

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }

}
