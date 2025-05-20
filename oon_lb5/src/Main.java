public class Main
{
    public static void main(String[] args)
    {
        MyArrayList list = new MyArrayList(5);
        System.out.println("пустий масив:"+list);

        for (int i = 0; i < 5; i++)
        {
            list.addToEnd(i);
        }
        System.out.println("додавання елементів кінець: "+list+"довжина"+list.size());


        MyListIterator it = list.iterator();

        System.out.println("\nhasNext: " + it.hasNext()+
                           "\nNext: " + it.next()+ "\tіндекс:"+ it.nextIndex()+
                           "\nNext: " + it.next()+"\tіндекс:"+ it.nextIndex());
        it.set(22); // змінюємо 2 на 22
        System.out.println("після заміни"+list);

        System.out.println("Previous: " + it.previous()+"\tіндекс:"+ it.previousIndex());
        it.remove(); // видаляємо 22

        it.add(11); // вставляємо 11
        System.out.println("після вставки"+list);
    }
}
