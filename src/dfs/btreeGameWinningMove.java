package dfs;


import tree.TreeNode;

/**
 * 1145. 二叉树着色游戏
 */
public class btreeGameWinningMove {
    private int left=0;
    private int right=0;

    public boolean solution(TreeNode root, int n, int x){
        dfs(root,x);
        int parent=n-left-right-1;
        return parent>n>>1||left>n>>1||right>n>>1;
    }

    private int dfs(TreeNode root,int tar){
        if (root==null)
            return 0;
        int left=dfs(root.left,tar);
        int right=dfs(root.right,tar);
        if (root.val==tar){
            this.left=left;
            this.right=right;
        }
        return left+right+1;
    }
}
