package bfs;

import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class zigzagLevelOrder {
    public List<List<Integer>> solution(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        int depth=0;
        Queue<TreeNode> queue=new ArrayDeque<>();
        if (root==null)
            return res;
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if (depth%2==0)
                    tmp.add(node.val);
                else {
                    tmp.add(0,node.val);
                }
                if (node.left!=null)
                    queue.add(node.left);
                if (node.right!=null)
                    queue.add(node.right);
            }
            depth++;
            res.add(tmp);
        }
        return res;
    }
}