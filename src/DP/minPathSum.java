package DP;

/**
 * 64.最小路径和
 */
public class minPathSum {
    public static int solution(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        for (int i=1;i<n;i++)
            grid[0][i]+=grid[0][i-1];
        for (int i=1;i<m;i++)
            grid[i][0]+=grid[i-1][0];
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                grid[j][i]=Math.min(grid[j-1][i]+grid[j][i],grid[j][i-1]+grid[j][i]);
            }
        }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,5},{3,2,1}};
        System.out.println(solution(a));
    }
}
