package Methods.ReturningValues;

import Methods.TakingArguments.Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReturningValues2 {

   Library getBorrowerDetails()
   {
       Library lib = new Library();

       lib.bookName = "The monk who sold his ferrari";
       lib.bookPrice = 250;
       lib.authorName = "Robin Sharma";

       lib.borrowedBy = "Amol Ujagare";
       lib.email = "amol@gmail.com";

       return lib;
   }



    public static void main(String[] args) throws ParseException {

        ReturningValues2 ob =new ReturningValues2();

        Library library = new Library();

        library = ob.getBorrowerDetails();

        library.displayBookInfo();
        library.borrowersInfo();


    }
}
