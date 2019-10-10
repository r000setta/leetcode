package tree;

/**
 * 104.二叉树最大深度
 */
public class MaxDepth2 {
    public int solution(TreeNode root){
        if (root==null)
            return 0;
        int left_depth=solution(root.left);
        int right_depth=solution(root.right);
        return Math.max(left_depth,right_depth)+1;
    }

}
