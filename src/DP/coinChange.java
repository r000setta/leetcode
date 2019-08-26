package DP;

/**
 * 322.零钱兑换???
 */
public class coinChange {
    public static int solution(int[] coins,int amount){
        int[] f=new int[amount+1];
        f[0]=0;
        for (int i=1;i<=amount;i++){
            int cost=Integer.MAX_VALUE;
            for (int j=0;j<coins.length;j++){
                if (i-coins[j]>=0){
                    if (f[i-coins[j]]!=Integer.MAX_VALUE)
                        cost=Math.min(cost,f[i-coins[j]]+1);
                }
            }
            f[i]=cost;
        }
        return f[amount]==Integer.MAX_VALUE?-1:f[amount];
    }

    public static void main(String[] args) {
        int[] c=new int[]{2};
        int a=solution(c,3);
    }

}
