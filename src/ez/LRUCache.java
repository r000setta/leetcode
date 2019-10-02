package ez;

import java.util.HashMap;
import java.util.Map;

/**
 * 146.LRU缓存机制
 */
public class LRUCache {
    class Node {
        public int key, val;
        public Node next, prev;

        public Node(int k, int v) {
            key = k;
            val = v;
        }
    }

    class DoubleList {
        private Node head, tail;
        private int size;

        public DoubleList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public void addFirst(Node x) {
            x.next = head.next;
            x.prev = head;
            head.next.prev = x;
            head.next = x;
            size++;
        }

        public void remove(Node x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size--;
        }

        public Node removeLast() {
            if (tail.prev == head) {
                return null;
            }
            Node last = tail.prev;
            remove(last);
            return last;
        }

        public int getSize() {
            return size;
        }
    }

    private Map<Integer, Node> map;

    private DoubleList cache;

    private int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        int val=map.get(key).val;
        put(key,val);
        return val;
    }

    public void put(int key, int val) {
        Node x=new Node(key,val);
        if (map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(x);
            map.put(key,x);
        }else {
            if (cap==cache.getSize()){
                Node last=cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(x);
            map.put(key,x);
        }
    }
}