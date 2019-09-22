package trie;

import java.util.HashSet;
import java.util.Set;

/**
 * 421.数组中两个数的最大异或
 */
public class FindMaximumXOR {
    public int solution(int[] nums){
        int res=0;
        int mask=0;
        for (int i=31;i>=0;i--){
            mask=mask|(1<<i);
            Set<Integer> set=new HashSet<>();
            for (int num:nums){
                set.add(num&mask);
            }
            int temp=res|(1<<i);
            for (Integer prefix:set){
                if (set.contains(prefix^temp)){
                    res=temp;
                    break;
                }
            }
        }
        return res;
    }

}