package DP;

import java.util.Stack;

/**
 * 84.柱状图中最大的矩形
 */
public class largestRecArea {
    private int caculate(int[] heights,int start,int end){
        if (start>end)
            return 0;
        int minindex=start;
        for (int i=start;i<=end;i++){
            if (heights[minindex]>heights[i]){
                minindex=i;
            }
        }
        return Math.max(heights[minindex]*(end-start+1),Math.max(caculate(heights,start,minindex-1),caculate(heights,minindex+1,end)));
    }
    public int solution(int[] heights){
        return caculate(heights,0,heights.length-1);
    }

    //????
    public int solution2(int[] heights){
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int maxarea=0;
        for (int i=0;i<heights.length;i++){
            while (stack.peek()!=-1&&heights[stack.peek()]>=heights[i])
                maxarea=Math.max(maxarea,heights[stack.pop()]*(i-stack.peek()-1));
            stack.push(i);
        }
        while (stack.peek()!=-1)
            maxarea=Math.max(maxarea,heights[stack.pop()]*(heights.length-stack.peek()-1));
        return maxarea;
    }
}
