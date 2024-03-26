package Arrays;

public class StringArrayDemo {

    public static void main(String[] args) {
        String[]  stArr = new String[10];

        stArr[0] = "priyanka";
        stArr[1] = "john";
        stArr[2] = "emma";
        stArr[3] = "michael";
        stArr[4] = "sophia";
        stArr[5] = "david";
        stArr[6] = "olivia";
        stArr[7] = "william";
        stArr[8] = "emily";
        stArr[9] = "james";


        for (int i=0 ; i< stArr.length ;i++ )
           System.out.println(stArr[i]);

        for (String s :stArr)
            System.out.println(s);
    }
}
