package bfs;

import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class largestValues {
    public List<Integer> solution(TreeNode root){
        Queue<TreeNode> queue=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return null;
        queue.offer(root);
        while (!queue.isEmpty()){
            int max=Integer.MIN_VALUE;
            int count=queue.size();
            while (count-->0){
                TreeNode tmp=queue.poll();
                if (tmp.left!=null)
                    queue.offer(tmp.left);
                if (tmp.right!=null)
                    queue.offer(tmp.right);
                if (tmp.val>max)
                    max=tmp.val;
            }
            list.add(max);
        }
        return list;
    }
}