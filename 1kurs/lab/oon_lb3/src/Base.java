public class Base
{
    //балансові змінні
    protected static int people_on_base = 113;
    protected static int vehicles_on_base = 0;
    protected static double petrol_on_base = 500;
    protected static double goods_on_base = 50;

    //виведення поточного стану бази
    public static void printf()
    {
        System.out.println("-------------------------------");
        System.out.println("Base Current Status");
        System.out.println("  People on base: " + people_on_base+
                           "\n  Vehicles on base: " + vehicles_on_base+
                           "\n  Petrol on base: " + petrol_on_base+
                           "\n  Goods on base: " + goods_on_base);
        System.out.println("-------------------------------");
    }

}
