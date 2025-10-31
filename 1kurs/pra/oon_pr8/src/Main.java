import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Employee.setMinSalary(5000); // мінімальна зарплата для всіх

        Person[] ar = new Person[5];
        ar[0] = new Client("Петро", "Приват", 10000, -30000);
        ar[1] = new Client("Марія", "Монобанк", 2000, -1000);
        ar[2] = new Client("Марися", "Ощад", 500, -500);
        ar[3] = new Employee("Олена", "Приват", 9000);
        ar[4] = new Employee("Іван", "Приват", 6000);

        for (Person p : ar)
        {
            p.display();
        }

        changes(ar);
        printAll(ar);
    }

    //зміна зарплат/балансів
    public static void changes(Person[] ar) {
        for (Person p : ar)
        {
            if (p instanceof Employee)
            {
                Employee e = (Employee) p;
                e.setSalary(55555);
            }
            else if (p instanceof Client)
            {
                Client c = (Client) p;
                int newSum = c.getSum()+560;
                c.setSum(newSum);
            }
        }
    }

    // друк поточного стану
    public static void printAll(Person[] ar)
    {
        for (Person p : ar)
        {
            p.display();
            if (p instanceof Employee)
            {
                Employee e = (Employee) p;
                System.out.println("  Salary: " + e.getSalary());
            }
            else if (p instanceof Client)
            {
                Client c = (Client) p;
                System.out.println("  Balance: " + c.getSum());
            }
        }
    }
}
