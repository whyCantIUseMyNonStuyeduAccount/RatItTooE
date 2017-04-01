public class DD<T> implements Deque<T> {

    private LLNode front, end;
    private int size;
 
    public DD() {
	front = end = null;
    }
    
    public void addFirst(T val){
	LLNode<T> subIn = new LLNode(val, null);
	if (size==0){
	    front = subIn;
	    end = subIn;
	}
	else {
	    subIn.setNext(new LLNode(front.getValue(),front.getNext()));
	    front = subIn;
	    size++;
	}
	
    }

    public String toString(){
	String retStr = "";
	LLNode<T> dummyNode = front;
	while (dummyNode != null){
	    retStr += dummyNode.getValue() + "-->";
	    dummyNode += dummyNode.getNext();
	}
	return retStr;
    }




    public static void main( String[] args ) {
	DD bob = new DD();
	bob.addFirst("No");
	bob.addFirst("Cake");
	bob.addFirst("For");
	bob.addFirst("You");
	System.out.println(bob);
    }

}
