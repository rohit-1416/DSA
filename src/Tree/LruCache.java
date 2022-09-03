package Tree;//////https://www.geeksforgeeks.org/lru-cache-implementation/
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
//
//public class LruCache {
//    private HashSet<Integer> hashSet;
//    private Deque<Integer> doublyQueue;
//    private final int CACHE_SIZE;
//
//    LruCache(int capacity){
//        hashSet = new HashSet<>();
//        doublyQueue= new LinkedList<>();
//        CACHE_SIZE = capacity;
//    }
//    void refer(int page){
//        if(! hashSet.contains(page)){
//            if( doublyQueue.size() == CACHE_SIZE ){
//                int last = doublyQueue.removeLast();
//                hashSet.remove(last);
//            }
//        }else {
//            doublyQueue.remove(page);
//        }
//        doublyQueue.push(page);
//        hashSet.add(page);
//    }
//
//    public void display(){
//        Iterator <Integer> itr = doublyQueue.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }
//
//
//    public static void main(String[] args) {
//        LruCache cache = new LruCache(4);
//        cache.refer(1);
//        cache.refer(2);
//        cache.refer(3);
//        cache.refer(1);
//        cache.refer(4);
//        cache.refer(5);
//        cache.display();
//    }
//}

public class LruCache {
    private HashSet<Integer> hashSet;
    private Deque<Integer> doublyQueue;
    protected final int CACHE_SIZE;

    LruCache(int capacity){
        hashSet = new HashSet<Integer>();
        doublyQueue = new LinkedList<Integer>();
        CACHE_SIZE =capacity;
    }
    void refer(int page){
        if(! hashSet.contains(page)){
            if(doublyQueue.size() == CACHE_SIZE){
                int last = doublyQueue.removeLast();
                hashSet.remove(last);
            }
        }else {
            doublyQueue.remove(page);
        }
        doublyQueue.push(page);
        hashSet.add(page);
    }
    void display(){
        Iterator <Integer> itr = doublyQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        LruCache cache = new LruCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.display();
    }
}
