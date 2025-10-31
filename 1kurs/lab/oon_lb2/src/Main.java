public class Main
{
    public static void main(String[] args)
    {
        //Конструктори
        Vector v1 = new Vector();
        Vector v2 = new Vector(-9);
        Vector v3 = new Vector(new int[]{1, 2, 3});

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2+"\tВмістимість v2:" + v2.getCapacity()+"\tv2 пустий?:" + v2.getIsEmpty());
        System.out.println("v3: " + v3+"\tЗаповненість v3:" + v3.getSize()+"\tЕлемент #3 з v3:" + v3.getEl(3));


        // Додавання елементів
        v1.addToEnd(100);
        // Додавання в позицію
        v1.add(0, 96);
        System.out.println("\nv1 після додавання елементів " + v1);

        // Вставити масив в позицію
        v1.addArr(1, new int[]{97, 98, 134, 99});
        System.out.println("v1 після додавання масиву: " + v1);

        // Вставити масив у кінець
        v2.addArrToEnd(new int[]{9, 8, 9});
        System.out.println("v2 після додавання масиву у кінець: " + v2);

        // Видалення
        System.out.println("\nEлемент для видалення: " + v1.removeEl(3));
        System.out.println("v1 після removeEl: " + v1);

        // Заміна
        System.out.println("\nEлемент для заміни: " + v2.replaceEl(1,9));
        System.out.println("v2 після set: " + v2);

        // Перевірка equals
        Vector v4 = new Vector(new int[]{5, 20, 10, 7, 8, 9});
        System.out.println("\nv1 == v4 ? " + v1.equals(new Vector(new int[] {96,97,89,99,101})));

        // Clear
        v1.clear();
        System.out.println("v1 після clear(): " + v1);
    }
}
