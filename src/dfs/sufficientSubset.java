package dfs;

import tree.TreeNode;

/**
 * 1080. 根到叶路径上的不足节点
 */
public class sufficientSubset {
    /**
     *
     * @param node
     * @param s
     * @param limit
     * @return node节点是否应该被删除
     */
    private boolean dfs(TreeNode node,int s,int limit){
        if (node.left==null&&node.right==null)
            return s+node.val<limit;
        boolean l=true;
        boolean r=true;
        if (node.left!=null)
            l=dfs(node.left,s+node.val,limit);
        if (node.right!=null)
            r=dfs(node.right,s+node.val,limit);
        if (l)
            node.left=null;
        if (r)
            node.right=null;
        return l&&r;
    }

    public TreeNode solution(TreeNode root,int limit){
        boolean d=dfs(root,0,limit);
        if (d)
            return null;
        return root;
    }
}
