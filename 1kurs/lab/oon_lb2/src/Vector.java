public class Vector
{
    // поля екземпляра
    private int[] vector;
    private int size;

    // конструктор за замовчуванням
    public Vector()
    {
        vector = new int[8];
        size=0;
    }

    // конструктори з параметрами
    public Vector(int capacity)
    {
        if(capacity<0)
        {
            capacity=8;
        }
        vector = new int[capacity];
        size=0;
    }
    public Vector(int[] ar)
    {
        vector = new int[ar.length];
        size=ar.length;
        for (int i=0; i<ar.length; i++)
        {
            vector[i] = ar[i];
        }
    }

    // методи доступу до полів
    public int getSize() //повертає кількість вставлених елементів
    {
        return size;
    }
    public boolean getIsEmpty()//перевіряє чи є пустим
    {
        return size == 0;
    }
    public int getCapacity() //повертає місткість
    {
        return vector.length;
    }
    public int getEl(int index) //повертає значення елементу
    {
        if(index<0 || index>=size)
        {
            return -666;
        }
        return vector[index];
    }

    // методи модифікації
    public int removeEl(int index) //повертає значення вказаного елементу вектора і видаляє його з вектора
    {
        if(index<0 || index>=size)
        {
            return -666;
        }
        int removedEl=getEl(index);
        for (int i = index; i<size-1; i++)
        {
            vector[i] = vector[i+1];
        }
        size--;
        return removedEl;
    }

    public int replaceEl(int index, int newValue) //установлює значення в указану позицію вектора, повертає старе значення
    {
        if(index<0 || index>=size)
        {
            return -666;
        }
        int removedEl=getEl(index);
        vector[index]=newValue;
        return removedEl;
    }

    public void addToEnd(int value)//вставляє елемент в кінець вектора
    {
        if (size == vector.length)
        {
            setMoreCapacity();
        }
        vector[size]=value;
        size++;
    }

    public boolean add(int index, int value) //вставляє елемент в позицію index
    {
        if(index<0 || index>size)
        {
            return false;
        }
        if (size == vector.length)
        {
            setMoreCapacity();
        }
        for(int i=size; i>index; i--)
        {
            vector[i]=vector[i-1];
        }
        vector[index]=value;
        size++;
        return true;
    }

    public void addArrToEnd(int[] ar) //вставляє елементи в кінець вектора
    {
        for (int j : ar)
        {
            addToEnd(j);
        }
    }

    public boolean addArr(int index, int[] ar) //вставляє елементи масиву ar в позицію index
    {
        if(index<0 || index>=size)
        {
            return false;
        }
        while (size+ ar.length>=vector.length)
        {
            setMoreCapacity();
        }
        for (int i=size-1; i>=index; i--)
        {
            vector[i+ ar.length]=vector[i];
        }
        System.arraycopy(ar, 0, vector, index, ar.length);
        size+=ar.length;
        return true;
    }

    public boolean equals(Vector other) //порівнює масиви двох векторів
    {
        if(size!=other.size)
        {
            return false;
        }
        for(int i=0; i<size; i++)
        {
            if(vector[i]!=other.vector[i])
            {
                return false;
            }
        }
        return true;
    }

    public void clear() //очищує вектор
    {
        size=0;
    }

    private void setMoreCapacity()
    {
        int[] longVector = new int[vector.length*2];
        if (size >= 0) System.arraycopy(vector, 0, longVector, 0, size);
        vector = longVector;
    }

    @Override
    public String toString()  //повертає рядок із size елементів  форматі: [1,5,…,3]
    {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                s.append(vector[i]);
                break;
            }
            s.append(vector[i]).append(",");
        }
        s.append("]");
        return s.toString();
    }
    /*public String toString()
    {
        String s="[";
        for(int i=0; i<size; i++)
        {
            if(i==size-1)
            {
                s+=vector[i]+"]";
                break;
            }
            s+=vector[i]+",";
        }
        return s;
    }*/
}
