package StringDemo;

public class SplitDemo4 {

    public static void main(String[] args) {
        String str = "we want to go to torranto ";
        String[] splittedStr = str.split(" ");

        // print only the words that ends with 'o'

        for (int i=0;i< splittedStr.length ; i++) {

                System.out.println(splittedStr[i]);
        }
    }
}
