package WapperClass;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        Integer ii = new Integer(5);

        System.out.println("ii="+ii);

        int a1 = ii.intValue(); // unboxing /unwrapping

        System.out.println("a1="+a1);

        int a2 = ii; // auto unboxing /auto unwrapping

        System.out.println("a2="+a2);


    }
}
