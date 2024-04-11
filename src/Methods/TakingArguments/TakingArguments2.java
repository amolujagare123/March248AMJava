package Methods.TakingArguments;

public class TakingArguments2 {

    void printMyArray(int[] arr)
    {
        for (int i=0; i<arr.length ;i++)
            System.out.println(arr[i]);
    }

    void printMyTwoDArray(String[][] stArr)
    {
        for (int i=0;i< stArr.length;i++)
        {
            for (int j=0;j< stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void setBookBorrower(Library li)
    {
        li.bookName = "Software Testing";
        li.bookPrice = 350;
        li.authorName = "Amol Ujagare";

        li.borrowedBy = "Swapnil";
        li.email = "swapnil@gmail.com";
    }


    public static void main(String[] args) {

        TakingArguments2 ob = new TakingArguments2();

        int[] a = {67,32,12,12,55,66,77,88,99,80,12};

        ob.printMyArray(a);

        String[][] ss = {
                {"Aarav", "Ananya", "Aditya", "Arjun", "Asha"},
                {"Bhavesh", "Bhavana", "Bharat", "Bhuvan", "Bhagyashree"},
                {"Chetan", "Chitra", "Chandrika", "Chirag", "Charu"},
                {"Divya", "Dinesh", "Deepika", "Devika", "Deven"}
        };

        ob.printMyTwoDArray(ss);

        Library library = new Library();

        ob.setBookBorrower(library);

        library.borrowersInfo();
        library.displayBookInfo();
    }
}
