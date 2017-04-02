public class DD<T> implements Deque<T> {

    private DLLNode<T> front, end;
    private int size;
 
    public DD() {
	front = end = null;
    }
    
    public void addFirst(T val){
	DLLNode<T> subIn = new DLLNode(val,null,null);
	if (size==0){
	    front = subIn;
	    end = subIn;
	    
	}
	else {
	    front.setPrev(subIn);
	    subIn.setNext(front);
	    front = subIn;
	}
	size++;
    }

    public void addLast(T val){
	DLLNode<T> subIn = new DLLNode(val,null,null);
	if (size==0){
	    front = subIn;
	    end = subIn;
	}
	else {
	    end.setNext(subIn);
	    subIn.setPrev(end);
	    end = subIn;
	}
	size++;
    }

    public String toString(){
	String retStr = "";
	DLLNode<T> dummyNode = front;
	while (dummyNode!=null){
	    retStr += dummyNode.getCargo();
	    retStr += " --> ";
	    dummyNode = dummyNode.getNext();
	}
	return retStr;
    }

    public boolean contains(Object O){
	DLLNode dummyFront=front;
	while (dummyFront != null){
	    if (dummyFront.getCargo().equals(O)){
		return true;
	    }
	    dummyFront=dummyFront.getNext();
	}
	return false;
    }

    public T getFirst() {
	return front.getCargo();
    }

    public T getLast() {
	return end.getCargo();
    }

    public T removeFirst(){
	T retT = this.getFirst();
	front = front.getNext();
	front.setPrev(null);
	return retT;
    }

    public T removeLast(){
	T retT= this.getLast();
	end = end.getPrev();
	end.setNext(null);
	return retT;
    }

    public static void main( String[] args ) {
	DD bob = new DD();
	bob.addFirst("you");
	bob.addFirst("for");
	bob.addFirst("cake");
	bob.addFirst("no");
	System.out.println("bob:" + bob);
	
	DD marley = new DD();
	marley.addLast("no");
	marley.addLast("cake");
	marley.addLast("for");
	marley.addLast("you");
	System.out.println("marley: " + marley);

	System.out.println("marley has cake?: " + marley.contains ("cake"));
	System.out.println("marley has plants?: " + marley.contains ("plants"));
	System.out.println("last: " + marley.getFirst());
	System.out.println("front: " + marley.getLast());
	System.out.println("removed first: " + marley.removeFirst());
	System.out.println("removed last: " + marley.removeLast());
	System.out.println(marley);
	
	
    }

}
