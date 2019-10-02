package DP;

public class minFallingPathSum {
    public static int solution(int[][] A){
        int n=A.length-2;
        int l=A[0].length;
        for (int i=n;i>=0;i--){
            for (int j=0;j<l;j++){
                if (j==0){
                    A[i][j]=A[i][j]+Math.min(A[i+1][j],A[i+1][j+1]);
                }else if (j==l-1){
                    A[i][j]=A[i][j]+Math.min(A[i+1][j],A[i+1][j-1]);
                }else {
                    A[i][j]=A[i][j]+Math.min(Math.min(A[i+1][j],A[i+1][j-1]),A[i+1][j+1]);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<l;i++){
            if (A[0][i]<min){
                min=A[0][i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a1=new int[]{1,2,3};
        int[] a3=new int[]{4,5,6};
        int[] a2=new int[]{7,8,9};
        int[][] A=new int[][]{a1,a2,a3};
        int a=solution(A);
    }
}