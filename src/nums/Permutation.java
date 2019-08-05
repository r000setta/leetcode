package nums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation {
    private void backtrack(int n,ArrayList<Integer> nums,List<List<Integer>> output,int first){
        if (first==n){
            output.add(new ArrayList<>(nums));
        }
        for (int i=first;i<n;i++){
            Collections.swap(nums,first,i);
            backtrack(n,nums,output,first+1);
            Collections.swap(nums,first,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int num:nums){
            list.add(num);
        }
        int n=nums.length;
        backtrack(n,list,res,0);
        return res;
    }
}
