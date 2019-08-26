package tree;

/**
 * 965.单值二叉树
 */
public class UnivalTree {
    public boolean is(TreeNode root,int val){
        if (root==null)
            return true;
        if (val!=root.val)
            return false;
        return is(root.left,val)&&is(root.right,val);
    }

    public boolean solution(TreeNode root){
        if (root==null)
            return true;
        return is(root,root.val);
    }
}
