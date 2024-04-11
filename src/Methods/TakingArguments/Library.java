package Methods.TakingArguments;

public class Library {

    public String bookName;
    public String authorName;
    public int bookPrice;
    public String borrowedBy;
    public String email;

    public void displayBookInfo()
    {
        System.out.println("bookName="+bookName);
        System.out.println("authorName="+authorName);
        System.out.println("bookPrice="+bookPrice);
    }

    public void borrowersInfo()
    {
        System.out.println("Book Borrowed="+bookName);
        System.out.println("borrowedBy="+borrowedBy);
        System.out.println("email="+email);
    }

}
