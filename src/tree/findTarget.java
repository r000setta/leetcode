package tree;

/**
 * 653.两数之和
 */
public class findTarget {
    public TreeNode findV(TreeNode node, int v) {
        if (node == null)
            return null;
        if (node.val == v)
            return node;
        if (v < node.val)
            return findV(node.left, v);
        else return findV(node.right, v);
    }

    public boolean preOrder(TreeNode node, TreeNode root, int k) {
        if (node == null)
            return false;
        int target = k - node.val;
        TreeNode found = findV(root, target);
        if (found != null && node != found)
            return true;
        else
            return preOrder(node.left, root, k) || preOrder(node.right, root, k);
    }

    public boolean findTarget(TreeNode root, int k) {
        return preOrder(root, root, k);
    }
}
