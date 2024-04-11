package Methods.ReturningValues;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReturningValues {

    int getMyValue()
    {
        int x = 89;
        return x;
    }

    String getTheString()
    {
        String str = "amol";
        String str2 = str + "123";
        return str2;
    }

    Date convertStringToDate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date myDate = sd.parse(dateStr);

        return myDate;
    }

    int[] getMyArray()
    {
        int[] x = {34,45,67,89,11,22,33,44};

        return x;
    }

    String[][] getMyTwoDArray()
    {
        String[][] ss = {
                {"Aarav", "Ananya", "Aditya", "Arjun", "Asha"},
                {"Bhavesh", "Bhavana", "Bharat", "Bhuvan", "Bhagyashree"},
                {"Chetan", "Chitra", "Chandrika", "Chirag", "Charu"},
                {"Divya", "Dinesh", "Deepika", "Devika", "Deven"}
        };

        return ss;
    }

    public static void main(String[] args) throws ParseException {

        int y;
        y = 45 ;
        System.out.println(y);
        int b = y;

        ReturningValues ob =new ReturningValues();

        System.out.println("ob.getMyValue()="+ob.getMyValue());

        int z = ob.getMyValue();

        System.out.println("z="+z);

        System.out.println(ob.getTheString());
        String ss = ob.getTheString();

        System.out.println(ob.convertStringToDate("13/04/2024"));


        int[] arr = ob.getMyArray();
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        String[][] stArr = ob.getMyTwoDArray();

        for (int i=0;i<stArr.length;i++)
        {
            for(int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
