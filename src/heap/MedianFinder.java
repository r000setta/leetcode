package heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 295. 数据流的中位数
 */
public class MedianFinder {
    private int count;
    private Queue<Integer> maxheap;
    private Queue<Integer> minheap;

    public MedianFinder(){
        count=0;
        maxheap=new PriorityQueue<>((x,y)->y-x);
        minheap=new PriorityQueue<>();
    }

    public void addNum(int num){
        count+=1;
        maxheap.offer(num);
        minheap.offer(maxheap.poll());
        if (count%2==1){
            maxheap.offer(minheap.poll());
        }
    }

    public double findMedian(){
        if(count%2==0){
            return (double)(maxheap.element()+minheap.element())/2;
        }else {
            return (double)maxheap.element();
        }
    }

}
