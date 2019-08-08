package backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 78.子集
 */
public class Subsets {
    public static List<List<Integer>> solution(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,nums,res,new ArrayList<>());
        return res;
    }

    public static void backtrack(int i,int[] nums,List<List<Integer>> res,ArrayList<Integer> tmp){
        res.add(new ArrayList<>(tmp));
        for (int j=i;j<nums.length;j++){
            tmp.add(nums[j]);
            backtrack(j+1,nums,res,tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3};
        List<List<Integer>> res=solution(a);
    }
}
