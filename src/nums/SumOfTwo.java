package nums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] a=new int[]{2,7,11,15};
        int[] b=betterWay(a,9);
        System.out.println(b[1]);
    }

    static public int[] twoSum(int[] nums,int target){
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }

    static private int[] betterWay(int[] nums,int target){
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.get(nums[i])!=null){
                res[0]=nums[i];
                res[1]=map.get(nums[i]);
                return res;
            }else{
                map.put(target-nums[i],nums[i]);
            }
        }
        return res;
    }
}
