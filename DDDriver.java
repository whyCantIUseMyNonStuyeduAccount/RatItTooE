//Nikita Borisov
//APCS2 pd01
//HW #29: Stress is the Best
//Due: 2017-04-05
public class DequeTester{
    public static void main(String[] args){
        DD<String> blarg = new DD<String>();
        //should return null twice
        //System.out.println(blarg.removeFro());
        //System.out.println(blarg.removeBackCareful());
        //should return null twice
        //System.out.println(blarg.peekFrontCareful());
        //System.out.println(blarg.peekBackCareful());
        //should return true
        System.out.println(blarg.addFirst("zeta"));
        //should return true
        System.out.println(blarg.addLast("iota"));
        //should return true
        System.out.println(blarg.addLast("xi"));
        //should return true
        System.out.println(blarg.addFirst("omicron"));
        //should return omicron twice (make sure peekFront doesn't alter deque)
        System.out.println(blarg.getFirst());
        System.out.println(blarg.getLast());
        //should return xi twice (make sure peekBack doesn't alter deque)
        System.out.println(blarg.getLast());
        System.out.println(blarg.getLast());
        //should return omicron
        System.out.println(blarg.removeFirst());
        //should return zeta
        System.out.println(blarg.removeFirst());
        //should return xi
        System.out.println(blarg.removeLast());
        //should return iota
        System.out.println(blarg.removeLast());
        //empty deque: should return null both times
        System.out.println(blarg.removeFirst());
        System.out.println(blarg.removeLast());
        //should return an overflow error
        for(int i = 0; i < 52; i += 1){
            blarg.addFirst("omega");
        }
    }
}
