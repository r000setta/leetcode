package DP;

/**
 * 121.最佳买股票时机
 */
public class MaxProfit {
    public static int solution(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minPrice)
                minPrice=prices[i];
            else if(prices[i]-minPrice>maxProfit)
                maxProfit=prices[i]-minPrice;
        }
        return maxProfit;
    }
}
