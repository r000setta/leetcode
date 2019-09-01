package DP;

/**
 * 221.最大正方形
 */
public class MaximalSquare {
    public int solution(char[][] matrix) {
        if (matrix.length==0)
            return 0;
        int[][] a = new int[matrix.length][matrix[0].length];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                a[i][j]=0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    try {
                        a[i][j]=Math.min(a[i-1][j-1],Math.min(a[i-1][j],a[i][j-1]))+1;
                    }catch (Exception e){
                        a[i][j]=1;
                    }
                    if (a[i][j]>max)
                        max=a[i][j];
                }
            }
        }
        return max*max;
    }
}