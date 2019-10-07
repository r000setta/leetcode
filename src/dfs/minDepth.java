package dfs;

import tree.TreeNode;

/**
 *111. 二叉树的最小深度
 */
public class minDepth {
    public int solution(TreeNode root){
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        int m1=solution(root.left);
        int m2=solution(root.right);
        if (root.left==null||root.right==null)
            return m1+m2+1;
        return Math.min(m1,m2)+1;
    }
}
