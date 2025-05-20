import java.util.Scanner;

public class Menu
{
    // Глобальні змінні
    static String name = "";
    static int age = 0,  height = 0, weight = 0;

    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;

        while (true)
        {
            System.out.println("\n--- Меню ---");
            System.out.println("1 Введіть ім’я");
            System.out.println("2 Введіть вік");
            System.out.println("3 Введіть зріст");
            System.out.println("4 Введіть вагу");
            System.out.println("5 Показати всю введену інформацію");
            System.out.println("0 Вихід");
            System.out.print("Виберіть дію (введіть номер від 0 до 5): ");

            choice = sc1.nextInt();

            switch (choice)
            {
                case 1:
                    inputName();
                    break;
                case 2:
                    inputAge();
                    break;
                case 3:
                    inputHeight();
                    break;
                case 4:
                    inputWeight();
                    break;
                case 5:
                    outputData();
                    break;
                case 0:
                    System.out.println("Завершення програми.");
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }

    static void inputName()
    {
        System.out.print("Введіть ім’я: ");
        sc1.nextLine();
        name = sc1.nextLine();
        System.out.println("Ім’я збережено.");
    }
    static void inputAge()
    {
        System.out.print("Введіть вік: ");
        age = sc1.nextInt();
        System.out.println("Вік збережено.");
    }
    static void inputHeight()
    {
        System.out.print("Введіть зріст (см): ");
        height = sc1.nextInt();
        System.out.println("Зріст збережено.");
    }
    static void inputWeight()
    {
        System.out.print("Введіть вагу (кг): ");
        weight = sc1.nextInt();
        System.out.println("Вага збережено.");
    }
    static void outputData()
    {
        System.out.printf("Інформація:\nІм’я: %s\nВік: %d\nЗріст: %d см\nВага: %d кг\n",
                name, age, height, weight);
    }
}
/*--- Меню ---
1 Введіть ім’я
2 Введіть вік
3 Введіть зріст
4 Введіть вагу
5 Показати всю введену інформацію
0 Вихід
Виберіть дію (введіть номер від 0 до 5): 1
Введіть ім’я: tim
Ім’я збережено.

--- Меню ---
1 Введіть ім’я
2 Введіть вік
3 Введіть зріст
4 Введіть вагу
5 Показати всю введену інформацію
0 Вихід
Виберіть дію (введіть номер від 0 до 5): 4
Введіть вагу (кг): 78
Вага збережено.

--- Меню ---
1 Введіть ім’я
2 Введіть вік
3 Введіть зріст
4 Введіть вагу
5 Показати всю введену інформацію
0 Вихід
Виберіть дію (введіть номер від 0 до 5): 5
Інформація:
Ім’я: tim
Вік: 0
Зріст: 0 см
Вага: 78 кг

--- Меню ---
1 Введіть ім’я
2 Введіть вік
3 Введіть зріст
4 Введіть вагу
5 Показати всю введену інформацію
0 Вихід
Виберіть дію (введіть номер від 0 до 5): 0
Завершення програми.*/