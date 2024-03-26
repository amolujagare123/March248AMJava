package Arrays.TwoDArray;

public class IntTwoDArrayDemo3 {
    public static void main(String[] args) {

        int[][] a = {

                {12,13,14} ,
                {22,23,24} ,
                {42,53,64} ,
                {72,83,94} ,
        };




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
