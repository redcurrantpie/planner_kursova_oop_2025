import java.util.NoSuchElementException;
public class MyArrayList<T>
{
    private Object[] ar;
    private int size;

    public MyArrayList(int capacity)// конструктор
    {
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Розмір масиву має бути >= 0");
        }
        ar = new Object[capacity]; //конструктор
        size = 0;
    }

    public boolean addToEnd(T n)//додавання елементу n в кінець списку
    {
        if (size == ar.length)
        {
            throw new IndexOutOfBoundsException("Масив заповнений");
        }
        ar[size] = n;
        size++;
        return true;
    }

    public T remove()//повертає останній елемент (якщо він існує) і видаляє  його зі списку
    {
        if (size == 0) return null;
        T removedEl=(T)ar[size-1];
        size--;
        return removedEl;
    }

    public int size() //кількість елементів списку
    {
        return size;
    }

    @Override
    public String toString()  //повертає рядок із size елементів  форматі: [1,5,…,3]
    {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < size; i++)
        {
            s.append(ar[i]);
            if (i != size - 1)
            {
                s.append(",");
            }
        }
        s.append("]");
        return s.toString();
    }

    public MyListIterator iterator()
    {
        return new MyListIteratorImpl();
    }

    private class MyListIteratorImpl implements MyListIterator<T>
    {
        int cursor = 0;
        int func = 0; // -1: prev, 1: next, 0: add/remove

        public boolean hasNext()//Повертає істину, якщо у ітератора є елементи для переходу по списку вперед
        {
            return cursor < size;
        }

        public boolean hasPrevious()// Повертає істину, якщо у ітератора є елементи для переходу по списку назад
        {
            return cursor > 0;
        }

        public T next()//Повертає наступний елемент у списку та змінює положення курсору.
        {
            if (!hasNext())
            {
                throw new NoSuchElementException("Немає наступного елемента");
            }

            func = 1;

            T el= (T)ar[cursor];
            cursor++;
            return el;
        }

        public T previous()//Повертає попередній елемент у списку і переміщує положення курсору назад
        {
            if (!hasPrevious())
            {
                throw new NoSuchElementException("Немає попереднього елемента");
            }

            func = -1;

            cursor--;
            return (T)ar[cursor];
        }

        public void set(T n)//Замінює останній елемент, повернутий next() або previous(), вказаним елементом.
        {
            if (func == 0)
            {
                throw new IllegalStateException("Метод next()/previous() не був викликаний або вже був викликаний remove()/add()");
            }

            if (func==1)
            {
                ar[cursor-1] = n;
                func = 0;
            }
            if (func==-1)
            {
                ar[cursor] = n;
                func = 0;
            }
        }

        public void remove()//Видаляє зі списку останній елемент, повернутий next() або previous()
        {
            if (func == 0)
            {
                throw new IllegalStateException("Метод next()/previous() не був викликаний або вже був викликаний remove()/add()");
            }
            if (func==1)
            {
                for (int i = cursor-1; i < size; i++)
                {
                    ar[i] = ar[i+1];
                }
                size--;
                cursor--;
                func = 0;
            }
            if (func==-1)
            {
                for (int i = cursor; i < size-1; i++)
                {
                    ar[i] = ar[i+1];
                }
                size--;
                func = 0;
            }
        }

        public int nextIndex()//Повертає індекс елемента, який міг бути повернутий наступним викликом next().
        {
            return cursor;
        }
        public int previousIndex()//Повертає індекс елемента, який міг бути повернутий наступним викликом previous().
        {
            return cursor - 1;
        }

        public void add(T n)//Вставляє вказаний елемент у список
        {
            if (size == ar.length)
            {
                throw new IllegalStateException("Масив заповнений");
            }

            for (int i = size; i > cursor; i--)
            {
                ar[i] = ar[i - 1];
            }
            ar[cursor] = n;
            size++;
            cursor++;
            func = 0;
        }
    }
}
