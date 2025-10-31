import java.util.Scanner;

public class Array
{
    // Глобальні змінні
    static int[] array = new int[9];

    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;

        while (true)
        {
            System.out.println("\n--- Меню ---");
            System.out.println("1 Заповнити масив випадковими числами");
            System.out.println("2 Змінити значення елемента масива");
            System.out.println("3 Відсортувати елементи масиву за зростанням");
            System.out.println("4 Надрукувати масив");
            System.out.println("0 Вихід");
            System.out.print("Виберіть дію (введіть номер від 0 до 4): ");

            choice = sc1.nextInt();

            switch (choice)
            {
                case 1:
                    fillRndArr();
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
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random()*50);
        }
        System.out.println("Масив заповнено.");
    }
    static void changeValue()
    {
        System.out.print("Індекс елемента для зміни: ");
        int index = sc1.nextInt();
        if (index>=0 && index<array.length)
        {
            System.out.print("Змінене значення: ");
            int value = sc1.nextInt();
            array[index] = value;
            System.out.println("Значення змінено.");
        }
        else
        {
            System.out.println("Неправильний індекс.");
        }
    }
    static void sortArray()
    {
        for (int i = 1; i < array.length; i++)
        {
            int temp=array[i];
            int j=i-1;
            while (j>=0 && array[j]>temp)
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }
    static void outputArray()
    {
        System.out.print("Масив: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
/*--- Меню ---
1 Заповнити масив випадковими числами
2 Змінити значення елемента масива
3 Відсортувати елементи масиву за зростанням
4 Надрукувати масив
0 Вихід
Виберіть дію (введіть номер від 0 до 4): 4
Масив: 0 0 0 0 0 0 0 0 0
--- Меню ---
1 Заповнити масив випадковими числами
2 Змінити значення елемента масива
3 Відсортувати елементи масиву за зростанням
4 Надрукувати масив
0 Вихід
Виберіть дію (введіть номер від 0 до 4): 1
Масив заповнено.

--- Меню ---
1 Заповнити масив випадковими числами
2 Змінити значення елемента масива
3 Відсортувати елементи масиву за зростанням
4 Надрукувати масив
0 Вихід
Виберіть дію (введіть номер від 0 до 4): 4
Масив: 15 10 24 16 20 47 26 25 37
--- Меню ---
1 Заповнити масив випадковими числами
2 Змінити значення елемента масива
3 Відсортувати елементи масиву за зростанням
4 Надрукувати масив
0 Вихід
Виберіть дію (введіть номер від 0 до 4): 2
Індекс елемента для зміни: 3
Змінене значення: 42
Значення змінено.

--- Меню ---
1 Заповнити масив випадковими числами
2 Змінити значення елемента масива
3 Відсортувати елементи масиву за зростанням
4 Надрукувати масив
0 Вихід
Виберіть дію (введіть номер від 0 до 4): 4
Масив: 15 10 24 42 20 47 26 25 37
--- Меню ---
1 Заповнити масив випадковими числами
2 Змінити значення елемента масива
3 Відсортувати елементи масиву за зростанням
4 Надрукувати масив
0 Вихід
Виберіть дію (введіть номер від 0 до 4): 0

Завершення програми.*/