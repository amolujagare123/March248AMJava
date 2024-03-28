package StringDemo;

public class SplitDemo3 {

    public static void main(String[] args) {
        String str = "Hey Baby you are so lovely";
        String[] splittedStr = str.split(" ");

        // print only the words that ends with 'y'

       /* for (int i=0;i< splittedStr.length ; i++) {

            String temp = splittedStr[i];
            int l = temp.length();

            // condition check - ends with y
            if(temp.charAt(l-1) == 'y')
                System.out.println(splittedStr[i]);
        }*/

        for (int i=0;i< splittedStr.length ; i++) {


            if(splittedStr[i].endsWith("y"))
                System.out.println(splittedStr[i]);
        }
    }
}
