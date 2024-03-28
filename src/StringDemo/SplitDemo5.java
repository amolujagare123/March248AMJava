package StringDemo;

public class SplitDemo5 {

    public static void main(String[] args) {
        String str = "who said this that we go no where";
        String[] splittedStr = str.split(" ");

        // print only the words whose second character is 'h'

        for (int i=0;i< splittedStr.length ; i++) {

                System.out.println(splittedStr[i]);
        }
    }
}
