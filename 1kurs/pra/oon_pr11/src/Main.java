import java.util.Arrays;

interface MyCheck
{
    boolean isRight(int n);
}

public class Main
{
    public static void main(String[] args)
    {
        int[][] array = new int[4][4];
        // Заповнення випадковими числами від -3 до 5
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                array[i][j] = (int) ((Math.random() * 9)-3);
            }
        }

        System.out.println("Поч. масив:");
        printArray(array);

        // // 1. Сортування за зростанням сумои елементів рядка
        Arrays.sort(array, (first, second) -> sumRow(first) - sumRow(second));
        System.out.println("\nСортування за зростанням сумои елементів рядка:");
        printArray(array);

        // 2. Сортування за зростанням кількості парних чисел
        Arrays.sort(array, (first, second) -> countEven(first) - countEven(second));
        System.out.println("\nСортування за кількістю парних чисел:");
        printArray(array);

        // 3. Сортування за кількістю чисел, кратних 3
        Arrays.sort(array, (first, second) -> countDivisibleBy3(first) - countDivisibleBy3(second));
        System.out.println("\nСортування за кількістю чисел, кратних 3:");
        printArray(array);

        // Перевірка методу sum()
        System.out.println("\nСума всіх парних чисел: " + sum(array, Main::isEven)+
                           "\nСума всіх додатних чисел: " + sum(array, Main::isPositive)+
                           "\nСума всіх від’ємних чисел: " + sum(array, Main::isNegative)+
                           "\nСума чисел, кратних 3: " + sum(array, Main::isDivisibleBy3));
    }

    // методи для сортування

    static int sumRow(int[] row)
    {
        int s = 0;
        for (int n : row) s += n;
        return s;
    }
    static int countEven(int[] row)
    {
        int count = 0;
        for (int n : row) if (n % 2 == 0) count++;
        return count;
    }
    static int countDivisibleBy3(int[] row)
    {
        int count = 0;
        for (int n : row) if (n % 3 == 0) count++;
        return count;
    }

    // Метод sum з MyCheck
    private static int sum(int[][] ar, MyCheck func)
    {
        int sum = 0;
        for (int[] row : ar)
            for (int val : row)
                if (func.isRight(val))
                    sum += val;
        return sum;
    }
    //Методи-критерії
    static boolean isEven(int n)
    {
        return n % 2 == 0;
    }
    static boolean isPositive(int n)
    {
        return n > 0;
    }
    static boolean isNegative(int n)
    {
        return n < 0;
    }
    static boolean isDivisibleBy3(int n)
    {
        return n % 3 == 0;
    }


    // Друк матриці
    public static void printArray(int[][] arr)
    {
        for (int[] row : arr)
        {
            for (int val : row)
            {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
