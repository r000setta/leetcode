package unions;

/**
 * 547，朋友圈
 */
public class FindCircleNum {
    public int solution(int[][] M){
        //表示第i个元素是否被DFS访问过
        int[] visited=new int[M.length];
        //计数器
        int count=0;
        for (int i=0;i<M.length;i++){
            if (visited[i]==0){
                dfs(M,visited,i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] M,int[] visited,int i){
        for (int j=0;j<M.length;j++){
            if (M[i][j]==1&&visited[j]==0){
                visited[j]=1;
                dfs(M,visited,j);
            }
        }
    }

}
