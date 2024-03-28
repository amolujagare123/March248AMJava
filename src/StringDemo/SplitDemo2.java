package StringDemo;

public class SplitDemo2 {

    public static void main(String[] args) {
        String str = "this might be his problem to miss the session";
        String[] splittedStr = str.split("is");

        for (int i=0;i< splittedStr.length ; i++)
            System.out.println(splittedStr[i]);
    }
}
