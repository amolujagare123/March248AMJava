package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException, InterruptedException {
        String dateStr = "12/03/2023";
        System.out.println("Given Date"+dateStr);


     //   Thread.sleep(9000);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println("Converted into System Date format: "+date);

        String dateStr0= "23-June-2016" ;
        // dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println("Converted into System Date format: "+date0);

        String dateStr1= "23 | June 16  8:34" ;
        //  dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("Converted into System Date format: "+date1);



        String dateStr2= "2016-06-23 | 8:34:23";
        // yyyy-MM-dd | hh:mm:ss
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println("Converted into System Date format: "+date2);

        String dateStr3= "Thursday 2016/06/23";
        // EEEE yyyy/MM/dd


        String dateStr4= "23-06-2016 | thu | 8:34" ;
        // dd-MM-yyyy | E | hh:mm

        String dateStr5= "8:34:22";
        // hh:mm:ss



    }
}
