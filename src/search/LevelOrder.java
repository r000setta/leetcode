package search;

import java.util.ArrayList;
import java.util.List;

/**
 * 102-二叉树的层次遍历
 */


public class LevelOrder {
    List<List<Integer>> levels = new ArrayList<>();

    public void helper(TreeNode node,int level){
        if (level>=levels.size())
            levels.add(new ArrayList<>());
        levels.get(level).add(node.val);
        if (node.left!=null)
            helper(node.left,level+1);
        if (node.right!=null)
            helper(node.right,level+1);
    }

    public List<List<Integer>> solution(TreeNode root){
        if (root==null){
            return levels;
        }
        helper(root,0);
        return levels;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
