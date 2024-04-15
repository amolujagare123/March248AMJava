package Abstraction;

public abstract class AbstractClass {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {

    }

}

class ChildAbstract extends AbstractClass
{


    void start() {
        System.out.println("start");
    }


   void run() {
        System.out.println("run");
    }
}
