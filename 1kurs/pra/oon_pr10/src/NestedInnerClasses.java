import java.util.Arrays;
import java.util.Comparator;


public class NestedInnerClasses
{
    public static void main(String[] args)
    {
        int[][] array = new int[4][4];
        // Заповнення випадковими числами від 0 до 5
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                array[i][j] = (int) (Math.random() * 6);
            }
        }

        System.out.println("Поч. масив: ");
        printArray(array);

        // 1. Сортування за зростанням сумои елементів рядка - внутрішній статичний клас–компаратор
        Arrays.sort(array, new MyComparator1());
        System.out.println("\nСортування за зростанням сумои елементів рядка:");
        printArray(array);

        // 2. Сортування за зростанням кількості парних чисел - локальний внутрішній клас–компаратор
        class OneMoreComparator implements Comparator<int[]>
        {
            public int compare(int[] first, int[] second)
            {
                return count(first) - count(second);
            }

            private int count(int[] row)
            {
                int count = 0;
                for (int n : row) if (n % 2 == 0) count++;
                return count;
            }
        }

        Arrays.sort(array, new OneMoreComparator());
        System.out.println("\nСортування за кількістю парних чисел:");
        printArray(array);

        // 3. Сортування за зростанням сумu перших двох елементів — анонімний внутрішній клас–компаратор
        Arrays.sort(array, new Comparator<int[]>()
        {
            public int compare(int[] first, int[] second)
            {
                return  (first[0] + first[1])- (second[0] + second[1]);
            }
        });

        System.out.println("\nСортування за зростанням сумu перших двох елементів:");
        printArray(array);
    }

    // Статичний внутрішній клас(компаратор): сортування за сумою елементів
    static class MyComparator1 implements Comparator<int[]>
    {
        public int compare(int[] first, int[] second)
        {
            return sum(first) - sum(second);
        }
        private int sum(int[] row)
        {
            int s = 0;
            for (int n : row) s += n;
            return s;
        }
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
