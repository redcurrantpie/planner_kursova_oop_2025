import java.util.ArrayList;

public class MyQueue implements IMyQueue
{
    private ArrayList<Double> v = new ArrayList<>();

    public void enqueue(double val)
    {
        v.add(val);
    }
    public double dequeue()
    {
        return v.remove(0);
    }
    public double peek()
    {
        return v.get(0);
    }
    public int getSize()
    {
        return v.size();
    }
    public void clear()
    {
        v.clear();
    }
}
