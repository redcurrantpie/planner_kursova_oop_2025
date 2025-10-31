//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Person
{
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        int age, height, weight;
        String name;

        System.out.print("Введіть ім’я: ");
        name = sc1.nextLine();
        System.out.print("Введіть вік: ");
        age = sc1.nextInt();
        System.out.print("Введіть зріст (см): ");
        height = sc1.nextInt();
        System.out.print("Введіть вагу (кг): ");
        weight = sc1.nextInt();


        System.out.printf("Інформація про людину:\nІм’я: %s\nВік: %d років\nЗріст: %d см\nВага: %d кг\n",
                name, age, height, weight);

        /*Введіть ім’я: Жан-Жак
Введіть вік: 45
Введіть зріст (в сантиметрах): 189
Введіть вагу (в кілограмах): 78
Інформація про людину:
Ім’я: Жан-Жак
Вік: 45 років
Зріст: 189 см
Вага: 78 кг*/
    }
}