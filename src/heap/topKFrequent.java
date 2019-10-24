package heap;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 */
public class topKFrequent {
    public List<Integer> solution(int[] nums,int k){
        HashMap<Integer,Integer> count=new HashMap<>();
        for (int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        Queue<Integer> heap=new PriorityQueue<>((n1,n2)->count.get(n1)-count.get(n2));
        for (int n:count.keySet()){
            heap.add(n);
            if (heap.size()>k)
                heap.poll();
        }
        List<Integer> top_k=new LinkedList<>();
        while (!heap.isEmpty())
            top_k.add(heap.poll());
        Collections.reverse(top_k);
        return top_k;
    }
}
