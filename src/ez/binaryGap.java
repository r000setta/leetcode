package ez;

/**
 * 868.二进制间距
 */
public class binaryGap {
    public int solution(int N){
        String s=Integer.toBinaryString(N);
        int old=0;
        int res=Integer.MIN_VALUE;
        char[] chars=s.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='1'){
                res=Math.max(res,i-old);
                old=i;
            }
        }
        return res;
    }
}
