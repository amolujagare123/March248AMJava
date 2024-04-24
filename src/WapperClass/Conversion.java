package WapperClass;

public class Conversion {

    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "22";
        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println(i1+i2);

        String s3 = "11.45";
        String s4 = "45.11";

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);

        System.out.println(d1+d2);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        System.out.println(f1+f2);

        String s5 = "TRue";
        boolean result = Boolean.parseBoolean(s5);

        if(result)
            System.out.println("This is pass (true)");
        else
            System.out.println("This is fail (false)");

        String s6 = "t";
        //char ch = Character.parseChar(s6);
        char ch = s6.charAt(0);

    /*    char[] chArr = s6.toCharArray();
        char c1 = chArr[0];
        */
       /* String str = "amol";

        char[] chArr = str.toCharArray();

        char c1 = chArr[0];*/

    }
}
