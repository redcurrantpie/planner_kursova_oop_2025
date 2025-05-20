import java.util.Scanner;
public class Funktion
{
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = sc1.nextDouble();
        System.out.printf("x = %.1f \t f(x) = %.17f", x, f(x));
    }

    static double f(double x)
    {
        double addition=1;
        double sum=addition;
        int k=0;
        do
        {
            k++;
            addition *= (-(x/k));
            sum+=addition;
        }
        while(Math.abs(addition) > 1e-6);
        return sum;
    }
}
/*
Enter x:
-1
x = -1,0 	 f(x) = 2,71828180114638450
Process finished with exit code 0
Enter x:
1
x = 1,0 	 f(x) = 0,36787946428571440
Process finished with exit code 0
0,5
x = 0,5 	 f(x) = 0,60653066483754960
 */