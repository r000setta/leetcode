package dfs;

/**
 * 200. 岛屿数量
 */
public class numIslands {
    private void dfs(char[][] grid,int r,int c){
        int nc=grid.length;
        int nr=grid[0].length;
        if (r<0||c<0||r>=nr||c>=nc||grid[r][c]=='0')
            return;
        grid[r][c]='0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }

    public int solution(char[][] grid){
        if (grid==null||grid.length==0)
            return 0;
        int nc=grid.length;
        int nr=grid[0].length;
        int num=0;
        for (int r=0;r<nr;r++){
            for (int c=0;c<nc;c++){
                if (grid[r][c]=='1'){
                    ++num;
                    dfs(grid,r,c);
                }
            }
        }
        return num;
    }
}