package FinalNStatic;

public /*final*/ class Employee {

    Employee()
    {
        System.out.println("inside employee");
    }

    Employee(String name)
    {
        System.out.println("name="+name);
      //  System.out.println("inside employee");
    }

    int salary = 10000;
    void empWork()
    {
        System.out.println("emp work");
    }

    /*final*/ void calculateSalary()
    {
        int presentDays = 22 ;

        int totalSalary = (10000 / 30) * 22;

        System.out.println("totalSalary = "+totalSalary);
    }
}

class Programmer extends Employee
{

    Programmer()
    {
        super("deepa");
        System.out.println(" inside programmer");
    }


    int bonus = 5000;
    int salary = 15000;

    @Override
    void calculateSalary()
    {
        int presentDays = 22 ;
        int totalSalary = (10000 / 30) * 22 + bonus;
        System.out.println("totalSalary = "+totalSalary);
    }

    void programmerWork()
    {
        System.out.println("programmer Work");
    }

    void display()
    {
        System.out.println("bonus="+bonus);
        System.out.println("salary="+salary);
        System.out.println("salary="+super.salary); // refer parent member

        calculateSalary();
        super.calculateSalary();
    }


    public static void main(String[] args) {

       // Programmer p = new Programmer();

       // Programmer p1;

       Employee e = new Programmer() ; // up casting

        e.calculateSalary();


    }
}

