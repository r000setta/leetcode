package DP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 120.三角形最小路径和
 */
public class MinimumTotal {
    public static int solution(List<List<Integer>> triangle){
        int res=Integer.MAX_VALUE;
        int[][] dp=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        dp[0][0]=triangle.get(0).get(0);
        for (int i=1;i<triangle.size();i++){
            for (int j=0;j<triangle.get(i).size();j++){
                if (j==0){
                    dp[i][j]=triangle.get(i).get(j)+dp[i-1][0];
                    continue;
                }
                if (j==triangle.get(i).size()-1){
                    dp[i][j]=triangle.get(i).get(j)+dp[i-1][triangle.get(i-1).size()-1];
                    continue;
                }
                dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i).get(j);
            }
        }
        for (int i=0;i<triangle.get(triangle.size()-1).size();i++){
            if (dp[triangle.size()-1][i]<res)
                res=dp[triangle.size()-1][i];
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> a1= Arrays.asList(2);
        List<Integer> a2= Arrays.asList(3,4);
        List<Integer> a3= Arrays.asList(6,5,7);
        List<Integer> a4= Arrays.asList(4,1,8,3);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        System.out.println(solution(list));
    }
}