package InheritanceDemo;

public class Employee {

    int salary = 10000;
    void empWork()
    {
        System.out.println("emp work");
    }
}

class Programmer extends Employee
{
    int bonus = 5000;

    void programmerWork()
    {
        System.out.println("programmer Work");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();

        System.out.println("bonus="+p.bonus);
        p.programmerWork();

        System.out.println("salary="+p.salary);
        p.empWork();
    }
}

