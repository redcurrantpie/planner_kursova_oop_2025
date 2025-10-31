class Employee extends Person
{
    private String bank;
    private int salary;
    static private int minSalary=200;

    public Employee(String name, String bank, int salary)
    {
        super(name);
        if (salary >= minSalary)
        {
            this.salary = salary;
        }
        else
        {
            this.salary = minSalary;
        }
        this.bank = bank;

    }

    public String getBank()
    {
        return bank;
    }
    public int getSalary()
    {
        return salary;
    }
    public static int getMinSalary()
    {
        return minSalary;
    }

    public void display()
    {
        System.out.printf("Employee Name: %s\tBank: %s\n", super.getName(),bank);
    }

    public boolean setSalary(int newSalary)
    {
        if (newSalary >= minSalary)
        {
            salary = newSalary;
            return true;
        }
        return false;
    }

    public static boolean setMinSalary(int newMinSalary)
    {
        if (newMinSalary >= 0)
        {
            minSalary = newMinSalary;
            return true;
        }
        return false;
    }
}