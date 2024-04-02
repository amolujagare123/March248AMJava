package StringDemo;

public class NumberString {

    public static void main(String[] args) {

        String str = "₹ 1,24,289";
        System.out.println("str="+str);

        String str01 = str.split(" ")[1]; // {"₹","4,289"} / 4,289
       // str01 -->  1,24,289
        
        String strWithoutComma = "";
        
        for (int i=0;i< str01.length();i++)
        {
            if (str01.charAt(i)!=',')
                strWithoutComma = strWithoutComma + str01.charAt(i);
        }

        System.out.println("strWithoutComma="+strWithoutComma);
    }
}
