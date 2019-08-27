package greedy;

import java.util.Arrays;

/**
 * 1029.两地调度
 */
public class twoCity {
    public int solution(int[][] costs){
        int t=costs.length;
        int cha[]=new int[t];
        int sum=0;
        for (int i=0;i<t;i++){
            cha[i]=costs[i][1]-costs[i][0];    //A到B城的消耗差
            sum+=costs[i][0];     //加上所有人到A城的费用
        }
        Arrays.sort(cha);
        for (int i=0;i<t/2;i++)
            sum+=cha[i];
        return sum;
    }
}
