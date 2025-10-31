import java.util.ArrayList;

public class MyStack implements IMyStack
{
    private ArrayList<Double> v = new ArrayList<>();  // композиція

    public void push(double val)
    {
        v.add(val);
    }
    public double pop() // делегування
    {
        return v.remove(v.size()-1);
    }
    public double peek()
    {
        return v.get(v.size()-1);
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
