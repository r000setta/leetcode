package DP;

/**
 * 96.不同的二叉搜索树
 */
public class NumTrees {
    public int solution(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i=1;i<=n;i++){
            for (int j=0;j<=i-1;j++){
                int tmp=dp[j]*dp[i-1-j];
                dp[i]+=tmp;
            }
        }
        return dp[n];
    }
}
