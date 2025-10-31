public class MySimpleContainer<T>
{
    private Object[] ar;
    private int size;

    public MySimpleContainer(int capacity)throws MyWrongParamException
    {
        if (capacity < 3)
        {
            throw new MyWrongParamException("Розмір контейнера має бути >= 3");
        }
        ar = new Object[capacity]; //конструктор
        size = 0;
    }

    public int size() //повертає кількість елементів, введених в контейнер
    {
        return size;
    }


    public T getEl(int index) throws MyWrongParamException //повертає значення вказаного елементу  контейнера
    {
        if (index < 0 || index >= size)
        {
            throw new MyWrongParamException("Невірний індекс.");
        }
        return (T) ar[index];
    }

    public T replaceEl(int index, T newObject) throws MyWrongParamException //установлює значення у вказану позицію, повертає старе значення
    {
        if (index < 0 || index >= size)
        {
            throw new MyWrongParamException("Невірний індекс.");
        }
        T removedEl = (T) ar[index];
        ar[index] = newObject;
        return removedEl;
    }


    public T remove() throws MyEmptyContainerException //вилучає останній доданий елемент в контейнері, повертає вилучений елемент
    {
        if (size <= 0)
        {
            throw new MyEmptyContainerException("Контейнер пустий");
        }
        T removed = (T) ar[size - 1];
        size--;
        return removed;
    }

    public void addToEnd(T newValue) throws MyFullContainerException //додає елемент у контейнер в кінець
    {
        if (size == ar.length)
        {
            throw new MyFullContainerException("Контейнер заповнений");
        }
        ar[size]=newValue;
        size++;
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
}
