package DP;

/**
 * 376.摆动序列
 */
public class WiggleMaxLength {
    public int solution(int[] nums){
        if (nums.length==0)
            return 0;
        int[] up=new int[nums.length];
        int[] down=new int[nums.length];
        up[0]=1;
        down[0]=1;
        for (int i=1;i<nums.length;i++){
            int t=nums[i]-nums[i-1];
            if(t>0){
                up[i]=down[i-1]+1;
                down[i]=down[i-1];
            }
            else if (t<0){
                down[i]=up[i-1]+1;
                up[i]=up[i-1];
            }
            else {
                down[i]=down[i-1];
                up[i]=up[i-1];
            }
        }
        return Math.max(down[nums.length-1],up[nums.length-1]);
    }
}