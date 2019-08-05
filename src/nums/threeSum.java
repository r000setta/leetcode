package nums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 15.三数之和
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 */
public class threeSum {
    public List<List<Integer>> solution(int[] sums){
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<sums.length;i++){
            for (int j=i+1;j<sums.length;j++){
                int k=sums[i]+sums[j];
                if (map.get(k)!=null){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(k);
                    tmp.add(Integer.valueOf(map.get(k).charAt(0)));
                    tmp.add(Integer.valueOf(map.get(k).charAt(1)));
                    res.add(tmp);
                }else{

                }
            }
        }
        return res;
    }
}
