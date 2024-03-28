package StringDemo;

public class SplitDemo {

    public static void main(String[] args) {
        String str = "This is Java Program";
        String[] splittedStr = str.split(" ");

        for (int i=0;i< splittedStr.length ; i++)
            System.out.println(splittedStr[i]);
    }
}
