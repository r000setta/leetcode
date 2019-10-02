package bfs;

import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 513.找树左下角的值
 */
public class findBottomLeftValue {
    public int solution(TreeNode root){
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root=queue.poll();
            if (root.right!=null)
                queue.offer(root.right);
            if (root.left!=null)
                queue.offer(root.left);
        }
        return root.val;
    }
}