package Abstraction;

public interface MyInterface {

    void start();
    void run();
    void display();

    default void nonAbstract1()
    {
        System.out.println("nonAbstract1");
    }
}

interface AnotherInterface
{
    void display();
}

class Child2Interface implements MyInterface,AnotherInterface
{

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        MyInterface ob = new Child2Interface();
        ob.display();

        AnotherInterface ob2 = new Child2Interface();
        ob2.display();
    }
}
