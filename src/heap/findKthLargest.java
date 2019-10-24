package heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 215. 数组中的第K个最大元素
 */
public class findKthLargest {
    public int solution(int[] nums,int k){
        Queue<Integer> heap=new PriorityQueue<>((n1,n2)->n1-n2);
        for (int n:nums){
            heap.add(n);
            if (heap.size()>k)
                heap.poll();
        }
        return heap.poll();
    }
}
