package DP;

/**
 * 279.完全平方数
 */
public class NumSquares {
    public static int solution(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for (int j=1;j<=Math.sqrt(i);j++){
                if (j*j==i){
                    dp[i]=1;
                    break;
                }
                int t=dp[i-j*j];
                if (t<min)
                    min=t;
            }
            if (dp[i]==0)
                dp[i]=min+1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}