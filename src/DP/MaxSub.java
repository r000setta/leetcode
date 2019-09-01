package DP;

/**
 * 53.最大子序列和————DP
 */
public class MaxSub {
    public static int solution(int[] nums){
        int maxhere,maxsum;
        maxhere=maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxhere<=0)
                maxhere=nums[i];
            else
                maxhere+=nums[i];
            if(maxhere>maxsum)
                maxsum=maxhere;
        }
        return maxsum;
    }
}
