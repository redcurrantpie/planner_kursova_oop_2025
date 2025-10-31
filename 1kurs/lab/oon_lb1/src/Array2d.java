import java.util.Scanner;

public class Array2d
{
    // Глобальні змінні
    static int rows =3, cols = 4;
    static int[][] array2d = new int[rows][cols];

    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args)
    {
        fillRndArr();

        while (true)
        {
            System.out.println("\n--- Меню ---");
            System.out.println("1 Створити новий масив");
            System.out.println("2 Змінити значення елемента масива");
            System.out.println("3 Відсортувати рядки масиву за зростанням суми елементів рядка");
            System.out.println("4 Надрукувати масив");
            System.out.println("0 Вихід");
            System.out.print("Виберіть дію: ");

            int choice;
            choice = sc1.nextInt();

            switch (choice)
            {
                case 1:
                    crtNewArr();
                    break;
                case 2:
                    changeValue();
                    break;
                case 3:
                    sortArray();
                    break;
                case 4:
                    outputArray();
                    break;
                case 0:
                    System.out.println("Завершення програми.");
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }

    static void fillRndArr()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                array2d[i][j] = (int) (Math.random() * 50);
            }
        }
    }
    static void crtNewArr()
    {
        System.out.print("Введіть кількість рядків: ");
        rows = sc1.nextInt();
        System.out.print("Введіть кількість стовпчиків: ");
        cols = sc1.nextInt();
        array2d = new int[rows][cols];
        fillRndArr();
        System.out.println("Масив заповнено.");
    }
    static void changeValue()
    {
        System.out.print("Індекс рядка для зміни: ");
        int indexi= sc1.nextInt();
        System.out.print("Індекс стовпчика для зміни: ");
        int indexj = sc1.nextInt();

        if (indexi>=0 && indexi<rows && indexj>=0 && indexj<cols)
        {
            System.out.print("Змінене значення: ");
            int value = sc1.nextInt();
            array2d[indexi][indexj] = value;
            System.out.println("Значення змінено.");
        }
        else
        {
            System.out.println("Неправильний індекс.");
        }
    }
    static void sortArray()
    {
        for (int i = 1; i < array2d.length; i++)
        {
            int[] temp = array2d[i];
            int j=i-1;
            while (j>=0 && sunRow(array2d[j])>sunRow(temp))
            {
                array2d[j+1]=array2d[j];
                j--;
            }
            array2d[j+1]=temp;
        }
    }
    static int sunRow(int[] row)
    {
        int sum=0;
        for (int i: row)
        {
            sum+= i;
        }
        return sum;
    }
    static void outputArray()
    {
        System.out.print("Масив: \n");
        for(int[] arr: array2d)
        {
            for(int num: arr)
            {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
/*--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 4
Масив:
  47   9  26  23
  16  25  19   2
  40  26  14  10

--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 1
Введіть кількість рядків: 2
Введіть кількість стовпчиків: 2
Масив заповнено.

--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 4
Масив:
   2  40
   4  17

--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 2
Індекс рядка для зміни: 0
Індекс стовпчика для зміни: 0
Змінене значення: 8
Значення змінено.

--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 4
Масив:
   8  40
   4  17

--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 3

--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 4

Масив:
   4  17
   8  40

--- Меню ---
1 Створити новий масив
2 Змінити значення елемента масива
3 Відсортувати рядки масиву за зростанням суми елементів рядка
4 Надрукувати масив
0 Вихід
Виберіть дію: 0
Завершення програми.*/