class MyQueue2 implements Container
{
    private MyQueue mq = new MyQueue();

    public void put(double val)
    {
        mq.enqueue(val);
    }

    public double get()
    {
        return mq.dequeue();
    }

    public double peek()
    {
        return mq.peek();
    }

    public int getSize()
    {
        return mq.getSize();
    }

    public void clear()
    {
        mq.clear();
    }
}