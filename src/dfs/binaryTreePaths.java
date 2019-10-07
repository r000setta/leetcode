package dfs;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 *257. 二叉树的所有路径
 */
public class binaryTreePaths {
    private void help(TreeNode root, String path, List<String> paths){
        if (root != null) {
            path+=Integer.toString(root.val);
            if ((root.left==null)&&(root.right==null))
                paths.add(path);
            else {
                path+="->";
                help(root.left,path,paths);
                help(root.right,path,paths);
            }
        }
    }

    public List<String> solution(TreeNode root){
        List<String> paths=new LinkedList<>();
        help(root,"",paths);
        return paths;
    }
}
