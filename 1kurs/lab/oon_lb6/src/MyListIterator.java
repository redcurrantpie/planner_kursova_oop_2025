public interface MyListIterator<T>
{
    boolean hasNext();
    boolean hasPrevious();
    T next();
    T previous();
    void set(T n);
    void remove();
    int nextIndex();
    int previousIndex();
    void add(T n);
}
