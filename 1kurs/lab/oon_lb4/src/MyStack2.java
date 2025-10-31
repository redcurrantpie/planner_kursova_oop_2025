class MyStack2 implements Container
{
    private MyStack ms = new MyStack();

    public void put(double val)
    {
        ms.push(val);
    }

    public double get()
    {
        return ms.pop();
    }

    public double peek()
    {
        return ms.peek();
    }

    public int getSize()
    {
        return ms.getSize();
    }

    public void clear()
    {
        ms.clear();
    }
}
