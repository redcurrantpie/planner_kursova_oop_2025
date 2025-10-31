import java.util.Arrays;

public class MyArray
{
    // поля екземпляра
    private int[] array;

    // конструктор за замовчуванням
    public MyArray()
    {
        array = new int[8];
    }

    // конструктор з параметрами
    public MyArray(boolean f)
    {
        array = new int[8];
        if(!f) return;
        fill(10);
    }
    public MyArray(int size)
    {
        if(size <= 0)
        {
            array = new int[8];
            return;
        }
        array = new int[size];
    }
    public MyArray(int size, boolean f)
    {
        array = new int[size];
        if(!f) return;
        fill(10);
    }
    public MyArray(int[] ar)
    {
        array = ar.clone();
    }

    //заповнення масиву випадковими числами
    private void fill(int k)
    {
        for(int i=0; i<array.length; i++)
        {
            array[i]=(int)(Math.random()*k);
        }
    }

    @Override
    public String toString()
    {
        return Arrays.toString(array);
    }
    /*public String toString() //повертає рядок в форматі: [1,5,…,3]
    {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                s.append(array[i]);
                break;
            }
            s.append(array[i]).append(",");
        }
        s.append("]");
        return s.toString();
    }*/

    public int size() //повертає розмір масиву
    {
        return array.length;
    }

    public int getEl(int index) //повертає значення вказаного елементу масиву
    {
        if(index<0 || index>=size())
        {
            return -666;
        }
        return array[index];
    }

    public int replaceEl(int index, int newValue) //установлює значення в указану позицію вектора, повертає старе значення
    {
        if(index<0 || index>=size())
        {
            return -666;
        }
        int removedEl=getEl(index);
        array[index]=newValue;
        return removedEl;
    }

    public void sort(boolean f) //сортує масив
    {
        Arrays.sort(array);
        if (!f)
        {
            for (int i = 0; i < array.length/2; i++)
            {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
    }

    public int[] subArray(int indexFrom, int indexTo) //повертає в новому масиві елементи від indexFrom до indexTo
    {
        if(indexFrom<0 || indexFrom>=size()) indexFrom=0;
        if(indexTo>=size()) indexTo=size()-1;
        if(indexFrom>indexTo)
        {
            int temp=indexFrom;
            indexFrom=indexTo;
            indexTo=temp;
        }

        int[] shortArray= new int[indexTo-indexFrom+1];
        System.arraycopy(array, indexFrom, shortArray, 0, shortArray.length);
        return shortArray;
    }

    public boolean equals(MyArray other) //порівнює масиви двох векторів
    {
        if(size()!=other.size())
        {
            return false;
        }
        for(int i=0; i<size(); i++)
        {
            if(array[i]!=other.array[i])
            {
                return false;
            }
        }
        return true;
    }
}
