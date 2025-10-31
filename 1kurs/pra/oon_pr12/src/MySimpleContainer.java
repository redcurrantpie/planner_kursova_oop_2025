public class MySimpleContainer
{
    private int[] ar;
    private int size;

    public MySimpleContainer(int capacity) throws MyWrongParamException //к-р, масив розміром capacit
    {
        if (capacity < 5)
        {
            throw new MyWrongParamException("Розмір контейнера має бути >= 5");
        }
        ar = new int[capacity];
        size = 0;
    }

    public int size() //повертає кількість елементів, введених в контейнер
    {
        return size;
    }

    public int getEl(int index) throws MyWrongParamException //повертає значення вказаного елементу  контейнера
    {
        if (index < 0 || index >= size)
        {
            throw new MyWrongParamException("Невірний індекс.");
        }
        return ar[index];
    }

    public int replaceEl(int index, int newValue) throws MyWrongParamException //установлює значення у вказану позицію, повертає старе значення
    {
        if (index < 0 || index >= size)
        {
            throw new MyWrongParamException("Невірний індекс.");
        }
        int removedEl=getEl(index);
        ar[index]=newValue;
        return removedEl;
    }

    public void addToEnd(int newValue) throws MyFullContainerException //додає елемент у контейнер в кінець
    {
        if (size == ar.length)
        {
            throw new MyFullContainerException("Контейнер заповнений");
        }
        ar[size]=newValue;
        size++;
    }

    public int removeEl() throws MyEmptyContainerException //вилучає останній доданий елемент в контейнері, повертає вилучений елемент
    {
        if (size <= 0)
        {
            throw new MyEmptyContainerException("Контейнер пустий");
        }
        int removedEl = ar[size - 1];
        size--;
        return removedEl;
    }

    @Override
    public String toString() //повертає рядок в форматі: [1,5,…,3]
    {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                s.append(ar[i]);
                break;
            }
            s.append(ar[i]).append(",");
        }
        s.append("]");
        return s.toString();
    }
}
