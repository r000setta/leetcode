package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1046.最后一块石头的重量
 */
public class LastStoneWeight {
    public static int solution(int[] stones){
        List<Integer> list=new ArrayList<>();
        for (int stone:stones)
            list.add(stone);
        while (list.size()!=0&&list.size()!=1){
            Collections.sort(list,Collections.reverseOrder());
            int y=list.get(0);
            int x=list.get(1);
            if (x==y){
                list.remove(0);
                list.remove(0);
            }else {
                int delta=y-x;
                list.remove(1);
                list.set(0,delta);
            }
        }
        if (list.isEmpty()){
            return 0;
        }else {
            return list.get(0);
        }
    }

    public static void main(String[] args) {
        int[] b=new int[]{2,2};
        int c=solution(b);
    }
}