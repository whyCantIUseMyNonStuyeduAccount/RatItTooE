# RatItTooE
Jonathan Quang, Joshel Xiedeng, Edward Ro

## Method Selections
###1) void	addFirst(T val)

###2) void	addLast(T val)

###3) String    toString()

###4) boolean   contains(Object O)

###5) T 	getFirst()

###6) T	     	getLast()

###7) T 	removeFirst()

###8) T	     	removeLast()

## Choice In Architecture
We chose to use a (doubly-linked) node-base architecture for our Deque.  The reason for this is because we thought that it would make some methods run faster.  In an array or arrayList, most of the time you will have to shift the data in the Deque in some fashion when you make a deletion or insertion.  In a node, however, you will only need to redirect the pointers of the required nodes.
