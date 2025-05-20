import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        //Конструктори
        MyArray a1 = new MyArray();
        MyArray a2 = new MyArray(true);
        MyArray a3 = new MyArray(5);
        MyArray a4 = new MyArray(12, true);
        MyArray a5 = new MyArray(new int[]{1, 2, 3, 4, 6});

        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("a4: " + a4);
        System.out.println("a5: " + a5);

        //Дії з a1
        System.out.println("\nSize of a1: " + a1.size());
        System.out.println("Element at index 20: " + a1.getEl(20));
        System.out.println("Replace element at index 1 with 5: " + a1.replaceEl(1, 5));
        System.out.println("a1 after replacement: " + a1);

        //сортування масиву a4 за спаданням
        a4.sort(false);
        System.out.println("\na4 sorted: " + a4);

        System.out.println("\na3 == a4? " + a3.equals(a4));
        System.out.println("a1 == a4? " + a1.equals(a4));

        MyArray a6 = new MyArray(5);
        System.out.println("a6: " + a6);
        System.out.println("a3 == a6? " + a3.equals(a6));
    }
}