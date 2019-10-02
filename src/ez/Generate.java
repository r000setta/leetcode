package ez;

import java.util.ArrayList;
import java.util.List;

/**
 * 118.杨辉三角
 */
public class Generate {
    public List<List<Integer>> solution(int numRows){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> n1=new ArrayList<>();
        n1.add(1);
        res.add(n1);
        for (int i=1;i<=numRows;i++){
            List<Integer> tmp=new ArrayList<>();
            for (int j=0;j<i;j++){
                List<Integer> prev=res.get(i-1);
                if (j==0||j==i-1){
                    tmp.add(1);
                }
                else {
                    tmp.add(prev.get(j)+prev.get(j-1));
                }

            }
            res.add(tmp);
        }
        res.remove(0);
        return res;
    }
}