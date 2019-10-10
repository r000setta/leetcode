package DP;

public class findMaxForm {
    public static int solution(String[] strs,int m,int n){
        int[][] dp=new int[m+1][n+1];
        for(String str:strs){
            int count0=count(str,'0');
            int count1=count(str,'1');
            for (int i=m;i>=count0;i--){
                for (int j=n;j>=count1;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-count0][j-count1]+1);
                }
            }
        }
        return dp[m][n];
    }

    private static int count(String str,char ch){
        int res=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strings=new String[]{"10", "0001", "111001", "1", "0"};
        int i=solution(strings,5,3);
    }
}
