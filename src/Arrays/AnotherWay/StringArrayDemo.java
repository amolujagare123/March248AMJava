package Arrays.AnotherWay;

public class StringArrayDemo {

    public static void main(String[] args) {
        String[]  stArr = {"priyanka","john","emma","michael","sophia"};


        for (int i=0 ; i< stArr.length ;i++ )
           System.out.println(stArr[i]);

        for (String s :stArr)
            System.out.println(s);
    }
}
