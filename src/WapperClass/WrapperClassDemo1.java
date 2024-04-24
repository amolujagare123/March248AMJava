package WapperClass;

public class WrapperClassDemo1 {

    public static void main(String[] args) {

        int a = 5;

        System.out.println("a="+5);

        Integer ii1 = new Integer(5);
        Integer ii2 = new Integer(a); // boxing / wrapping

        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

        Integer ii3 = 5 ;
        Integer ii4 = a ;  // auto boxing / auto wrapping

        System.out.println("ii3="+ii3);
        System.out.println("ii4="+ii4);

    }
}
