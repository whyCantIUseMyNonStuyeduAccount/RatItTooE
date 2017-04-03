# RatItTooE
Jonathan Quang, Joshel Xiedeng, Edward Ro

## Method Selections
#### 1) void	 addFirst(T val)
First, make a new DLLNode (subIn) with the input as cargo and pointers as null.  If the size of the Deque is 0, set both front and end as subIn.  If not, set the "previous" pointer of front to subIn, set the "next" pointer of subIn to front, and set front as subIn.  Finally, add 1 to size.

#### 2) void	 addLast(T val)
First, make a new DLLNode (subIn) with the input as cargo and pointers as null.  If the size of the Deque is 0, set both front and end as subIn.  If not, set the "next" pointer of end to subIn, set the "previous" pointer of subIn to end, and set end as subIn. Finally, add 1 to size.

#### 3) String  toString()
First, make a new String (retStr) that's empty.  Second, make a new DLLNode (dummyNode) and set it equal to front.  While dummyNode isn't empty, add its cargo to retStr, add "-->" to retStr, and set dummyNode equal to its next DLLNode.  Finally, return retStr.

#### 4) boolean contains(Object O)
First, make a new DLLNode (dummyFront) and set it equal to front.  While dummyFront isn't empty, if the cargo is equal to the input: return true, regardless set dummyFront equal to its next DLLNode.  If the loop is completed, return false.

#### 5) T 	 getFirst()
Return the cargo of front.

#### 6) T	 getLast()
Return the cargo of end.

#### 7) T 	 removeFirst()
First, make a T (retT) and set it as the cargo of front.  Then, set front equal to its next DLLNode.  Then, set the "previous" pointer of front to null.  Finally, return retT.

#### 8) T	 removeLast()
First, make a T (retT) and set it as the cargo of end.  Then, set end equal to its previous DLLNode.  Then, set the "next" pointer of end to null, Finally, return retT.

#### 9) int      size()
Return the value of variable size.

## Choice In Architecture
We chose to use a (doubly-linked) node-base architecture for our Deque.  The reason for this is because we thought that it would make some methods run faster.  In an array or arrayList, most of the time you will have to shift the data in the Deque in some fashion when you make a deletion or insertion.  In a node, however, you will only need to redirect the pointers of the required nodes.
