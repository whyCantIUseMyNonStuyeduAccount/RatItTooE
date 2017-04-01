public class DD<T> implements Deque<T> {

    private DLLNode front, end;
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
	    System.out.println(retStr);
	    retStr += dummyNode.getCargo();
	    retStr += " --> ";
	    dummyNode = dummyNode.getNext();
	}
	return retStr;
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
	
    }

}
