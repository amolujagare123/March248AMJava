package Abstraction;

public interface InterfaceDemo {

    void start();
    void run();

    default void nonAbstract1()
    {
        System.out.println("nonAbstract1");
    }

    private void nonAbstract2()
    {
        System.out.println("nonAbstract2");
    }

    static void nonAbstract3()
    {
        System.out.println("nonAbstract3");
    }

}

class ChildInterface implements InterfaceDemo
{
    public void start() {
        System.out.println("start");
    }


    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        InterfaceDemo ob =new ChildInterface();
        ob.run();
        ob.start();
    }
}
