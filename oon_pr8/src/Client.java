public class Client extends Person
{
    private String bank;
    private int sum;
    private int minSum;

    public Client(String name, String bank, int sum, int minSum)
    {
        super(name);
        this.bank = bank;
        this.sum = sum;
        this.minSum = minSum;
    }

    public String getBank()
    {
        return bank;
    }
    public int getSum()
    {
        return sum;
    }
    public int getMinSum()
    {
        return minSum;
    }

    public void display()
    {
        System.out.printf("Client Name: %s\tBank: %s\n", super.getName(),bank);
    }

    public boolean setSum(int newSum)
    {
        if (newSum >= minSum)
        {
            sum = newSum;
            return true;
        }
        return false;
    }

    public boolean setMinSum(int newMinSum)
    {
        minSum = newMinSum;
        return true;
    }
}
