package ez;

/**
 * 136.只出现一次的数字
 */
public class SingleNumber {
    public int solution(int[] nums){
        int a=0;
        for (int num:nums){
            a^=num;
        }
        return a;
    }
}