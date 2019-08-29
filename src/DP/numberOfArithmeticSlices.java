package DP;

/**
 * 413.等差数列的划分
 */
public class numberOfArithmeticSlices {
    public int solution(int[] A){
        if (A.length==0||A.length==1)
            return 0;
        int[] dp=new int[A.length];
        dp[0]=0;
        dp[1]=0;
        int sum=0;
        for (int i=2;i<A.length;i++){
            if (A[i]-A[i-1]==A[i-1]-A[i-2]){
                dp[i]=dp[i-1]+1;
                sum+=dp[i];
            }
        }
        return sum;
    }
}
