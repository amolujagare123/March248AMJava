package ClassNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass ob = new MyClass();
        ob.a = 10;
        ob.d = 90.89;
        ob.c = 'g';
        ob.str ="Amol";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 23;
        ob2.d = 89.45;
        ob2.c = 'g';
        ob2.str = "text";

        ob2.display();

    }

}
