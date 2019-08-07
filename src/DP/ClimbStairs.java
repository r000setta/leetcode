package DP;

/**
 * 70.爬楼梯
 */
public class ClimbStairs {
    private int solution(int n){
        int[] a=new int[n];
        if (n==1)
            return 1;
        a[0]=1;
        a[1]=2;
        for (int i=3;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
}
