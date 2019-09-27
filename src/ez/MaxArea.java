package ez;

/**
 * 11.盛水最多的容器
 */
public class MaxArea {
    public int solution(int[] heights){
        int start=0;
        int end=heights.length-1;
        int max=Integer.MIN_VALUE;
        while (start!=end){
            int left=heights[start];
            int right=heights[end];
            max=Math.max((end-start)*Math.min(left,right),max);
            if (left>=right){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}