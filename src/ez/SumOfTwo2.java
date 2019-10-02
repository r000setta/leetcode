package ez;

import com.sun.tools.javac.util.StringUtils;

import java.util.*;

/**
 * 167.两数之和2
 */
public class SumOfTwo2 {
    public int[] solution(int[] numbers,int target){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int num:numbers){
            list.add(num);
        }
        int[] res=new int[2];
        for (int i=0;i<numbers.length;i++){
            if (!map.containsKey(numbers[i])){
                map.put(target-numbers[i],numbers[i]);
            }else {
                res[1]=i+1;
                res[0]=list.indexOf(map.get(numbers[i]))+1;
            }
        }
        return res;
    }
}