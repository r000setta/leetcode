package backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 401.二进制手表
 */
public class BinaryWatch {
    public List<String> solution(int num){
        List<String> times=new ArrayList<>();
        for (int h=0;h<12;h++){
            for (int m=0;m<60;m++){
                if (Integer.bitCount(h)+Integer.bitCount(m)==num){
                    times.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return times;
    }
}
