package bfs;

import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 1161. 最大层内元素和
 */
public class maxLevelSum {
    public int solution(TreeNode root){
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        int level=1;
        int res=0;
        int max=Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int t=0;
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode node=queue.poll();
                t+=node.val;
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
            }
            if (t>max){
                max=t;
                res=level;
            }
            level++;
        }
        return res;
    }
}