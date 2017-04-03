public interface Deque<T> {
    
    //public boolean add( T e ); 
    //Didn't add because the next two functions under it will make it redundant.
    public void addFirst( T e );
    public void addLast( T e );

    public boolean contains( Object O );

    public T getFirst();
    public T getLast();
    
    //public boolean removeFirstOccurence( Object O );
    //public boolean removeLastOccurence( Object O );
    //Didn't add because deque shouldn't be able to edit the middle of the deque
    
    public T removeFirst();
    public T removeLast();

    public int size();

    
}
