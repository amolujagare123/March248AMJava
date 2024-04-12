package FinalNStatic.Sample;


import FinalNStatic.StaticMethodDemo;

import static FinalNStatic.StaticMethodDemo.*;
/*import static FinalNStatic.StaticMethodDemo.staticMethod1;
import static FinalNStatic.StaticMethodDemo.staticMethod2;*/

public class DemoClass {

    public static void main(String[] args) {
        StaticMethodDemo ob = new StaticMethodDemo();

        staticMethod1();
        staticMethod2();

        staticMethod1();
        staticMethod2();

        staticMethod1();
        staticMethod2();

        college = "";
    }
}
