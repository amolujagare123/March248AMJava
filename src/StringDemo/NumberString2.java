package StringDemo;

public class NumberString2 {

    public static void main(String[] args) {

        String str = "₹ 1,14,289";
        System.out.println("str="+str);

        String str01 = str.split(" ")[1]; // {"₹","4,289"} / 4,289
       // str01 -->  1,24,289

        str01 = str01.replace(",","");

        System.out.println("strWithoutComma="+str01);
    }
}
