package tree;

/**
 * 110. 平衡二叉树
 */
public class isBalanced {
    public boolean solution(TreeNode root){
        return depth(root)!=-1;
    }

    private int depth(TreeNode root){
        if (root==null)
            return 0;
        int left=depth(root.left);
        if (left==-1)
            return -1;
        int right=depth(root.right);
        if (right==-1)
            return -1;
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }
}
