package ez;

import java.util.HashMap;
import java.util.Map;

/**
 * 169.求众数
 */
public class MajorityElement {
    public int solution(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int count=nums.length/2;
        for (int num:nums){
            if (!map.containsKey(num))
                map.put(num,0);
            int v=map.get(num);
            if (v>=count){
                return num;
            }
            map.put(num,++v);
        }
        return 0;
    }
}