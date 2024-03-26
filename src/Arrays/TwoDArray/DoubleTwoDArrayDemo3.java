package Arrays.TwoDArray;

public class DoubleTwoDArrayDemo3 {
    public static void main(String[] args) {

        double[][] d = {
                {5.6,34.56,11.22,67.89,11.22}  ,
                {1.6,44.56,161.22,687.89,171.22}  ,
                {25.6,54.56,61.22,617.89,101.22}

        };
        System.out.println("row="+d.length);
        System.out.println("col="+d[0].length);

        for (int i=0;i<d.length;i++)
        {
            for (int j=0;j<d[0].length;j++)
            {
                System.out.print(d[i][j]+"\t\t");
            }
            System.out.println();
        }



    }

}
