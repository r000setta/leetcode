package dfs;

import tree.TreeNode;

/**
 * 124. 二叉树中的最大路径和
 */
public class maxPathSum {

    int max_sum=Integer.MIN_VALUE;

    public int max_gain(TreeNode node){
        if (node==null)
            return 0;
        int left_gain=Math.max(max_gain(node.left),0);
        int right_gain=Math.max(max_gain(node.right),0);

        int price_newpath=node.val+left_gain+right_gain;

        max_sum=Math.max(max_sum,price_newpath);

        return node.val+Math.max(left_gain,right_gain);
    }

    public int maxPathSum(TreeNode root){
        max_gain(root);
        return max_sum;
    }
}
