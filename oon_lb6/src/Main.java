public class Main
{
    public static void main(String[] args)
    {
        testType("String", new MyArrayList<String>(5), "asd", "jhg", "J", "uhff", "iht");
        testType("Integer", new MyArrayList<Integer>(3), 1, 2, 3, 4);
        testType("Double", new MyArrayList<Double>(4), 1.1, 2.2, 3.3);
    }

    private static <T> void testType(String typeName, MyArrayList<T> list, T... values) {
        System.out.println("\nТип: " + typeName);

        // додавання
        for (T val : values)
        {
            try
            {
                System.out.println("  addToEnd(" + val + "): " + list.addToEnd(val));
            }
            catch (Exception ex)
            {
                System.out.println("  addToEnd(" + val + "): " + ex);
            }
        }

        // Вивід списку
        System.out.println("\n  Поточний список: " + list);


        // Видалення
        try
        {
            System.out.println("  remove(): " + list.remove());
        }
        catch (Exception ex)
        {
            System.out.println("  remove: " + ex);
        }

        System.out.println("  після remove: " + list);

        // Ітератор
        MyListIterator<T> it = list.iterator();

        try {
            while (it.hasNext())
            {
                T item = it.next();
                System.out.println("  next: " + item);
            }
            it.next();
        }
        catch (Exception ex)
        {
            System.out.println("  #: " + ex);
        }

        try
        {
            while (it.hasPrevious())
            {
                T item = it.previous();
                System.out.println("  previous: " + item);
            }
            it.previous(); // виняток
        }
        catch (Exception ex)
        {
            System.out.println("  #: " + ex);
        }


        try
        {
            it.add(values[0]);
            System.out.println("  Список після iterator.add(): " + list);
        }
        catch (Exception ex)
        {
            System.out.println("  #: " + ex);
        }

        try
        {
            it.next();
            it.set(values[1]);
            System.out.println("  Список після iterator.set(): " + list);
        }
        catch (Exception ex)
        {
            System.out.println("  #: " + ex);
        }

        try
        {
            it.remove();
            System.out.println("Список після iterator.remove(): " + list);
        }
        catch (Exception ex)
        {
            System.out.println("  #: " + ex);
        }
    }
}
