package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 112.路径总和
 */
public class hasPathSum {
    int count=0;
    //1
    public boolean solution(TreeNode root,int sum){
        if (root==null)
            return false;
        sum-=root.val;
        if (root.left==null&&root.right==null)
            return sum==0;
        else
            return solution(root.left,sum) || solution(root.right,sum);
    }


    //2
    public List<List<Integer>> solution2(TreeNode root, int sum){
        List<List<Integer>> res=new ArrayList<>();
        helper(root,sum,res,new ArrayList<>());
        return res;
    }

    private void helper(TreeNode root,int sum,List<List<Integer>> res,List<Integer> temp){
        if (root==null)
            return;
        temp.add(root.val);
        if (root.left==null&&root.right==null&&sum==root.val)
            res.add(new ArrayList<>(temp));
        helper(root.left,sum-root.val,res,temp);
        helper(root.right,sum-root.val,res,temp);
        temp.remove(temp.size()-1);
    }

    //3
    public int solution3(TreeNode root,int sum){
        if (root==null)
            return 0;
        return helper2(root,sum)+solution3(root.left,sum)+solution3(root.right,sum);
    }

    private int helper2(TreeNode root,int sum){
        if (root==null)
            return 0;
        sum-=root.val;
        return (sum==0?1:0)+helper2(root.left,sum)+helper2(root.right,sum);
    }
}
