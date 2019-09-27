package greedy;

/**
 * 122.买卖股票最佳时机
 */
public class MaxProfit {
    public int solution(int[] prices){
        int res=0;
        for (int i=0;i<prices.length-1;i++){
            if (prices[i]<prices[i+1]){
                int price=prices[i+1]-prices[i];
                res+=price;
            }
        }
        return res;
    }
}