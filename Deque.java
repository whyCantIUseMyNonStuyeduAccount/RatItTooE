public interface Deque<T> {

    public void addFirst(T e);
    public void addLast(T e);

    public boolean contains(Object O);

    public T getFirst();
    public T getLast();

    public T removeFirst(Object O);
    public T removeLast(Object O);

    public int size();

    
}
