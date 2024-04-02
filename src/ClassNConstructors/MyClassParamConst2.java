package ClassNConstructors;

public class MyClassParamConst2 {

    int a;
    double d;
    char c;
    String str; // data members
    MyClassParamConst2(int a, double d, char c, String str)
    {
        this.a = a ;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClassParamConst2 ob = new MyClassParamConst2(23,34.56, 'g',"java");


        ob.display();


    }

}
