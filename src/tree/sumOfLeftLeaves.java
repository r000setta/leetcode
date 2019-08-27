package tree;

/**
 * 404.左叶子之和
 */
public class sumOfLeftLeaves {
    int ans=0;

    public int solution(TreeNode root) {
        helper(root);
        return ans;
    }

    private void helper(TreeNode node) {
        if (node == null)
            return;
        //判断是否为叶子节点
        if (node.left != null && node.left.left == null && node.left.right == null)
            ans += node.left.val;
        helper(node.left);
        helper(node.right);
    }
}
