package tree;

/**
 * 669.剪枝BST
 */
public class trimBST {
    public TreeNode solution(TreeNode root,int L,int R){
        if (root==null)
            return null;
        if (root.val>R)
            return solution(root.left,L,R);
        if (root.val<L)
            return solution(root.right,L,R);
        root.left=solution(root.left,L,R);
        root.right=solution(root.right,L,R);
        return root;
    }
}
