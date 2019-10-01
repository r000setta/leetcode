package bit;

/**
 * 762.二进制表示中质数个计算置位
 */
public class countPrimeSetBits {
    public int solution(int L,int R){
        int[] primes = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1};
        int res=0;
        for (int i=L;i<=R;i++){
            int t=Integer.bitCount(i);
            res+=primes[t];
        }
        return res;
    }
}
