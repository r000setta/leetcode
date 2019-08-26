package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1162.地图分析???
 */
public class maxDistance {
    public int solution(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        if (queue.isEmpty() || queue.size() == m * n)
            return -1;
        int[][] next = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        int level = -1;
        while (!queue.isEmpty()){
            int count=queue.size();
            for (int i=0;i<count;i++){
                int[] cur=queue.poll();
                for (int[] nt:next){
                    int nx=cur[0]-nt[0],ny=cur[1]-nt[1];
                }
            }
        }
        return 1;
    }
}
