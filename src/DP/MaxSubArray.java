package DP;


/**
 * 53.最大子序列
 */
public class MaxSubArray {
    public int solution(int[] nums){
        int ans=nums[0];
        int sum=0;
        for (int num:nums){
            if (sum>0)
                sum+=num;
            else
                sum=num;
            ans= Math.max(ans,num);
        }
        return ans;
    }
}
