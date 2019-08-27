package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 589.N叉树遍历
 */
public class Preorder {
    //前序
    public List<Integer> solution(Node root){
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }

    private void helper(Node root,List<Integer> res){
        if (root==null)
            return;
        res.add(root.val);
        for (Node child : root.children) {
            helper(child,res);
        }
    }

    //后序
    public List<Integer> solution2(Node root){
        List<Integer> res=new ArrayList<>();
        if (root==null)
            return res;
        helper2(root,res);
        res.add(root.val);
        return res;
    }

    private void helper2(Node root,List<Integer> res){
        if (root==null)
            return;
        for (Node child:root.children){
            helper2(child,res);
            res.add(child.val);
        }

    }

    //层序
    public List<List<Integer>> solution3(Node root){
        List<List<Integer>> res=new ArrayList<>();
        if (root==null)
            return res;
        helper3(root,0,res);
        return res;
    }

    private void helper3(Node root,int depth,List<List<Integer>> res){
        if (root==null)
            return;
        if (depth+1>res.size())
            res.add(new ArrayList<>());
        res.get(depth).add(root.val);
        for (Node node:root.children){
            if (node!=null)
                helper3(node,depth+1,res);
        }
    }


}
