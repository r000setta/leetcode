package greedy;

import java.util.Arrays;
import java.util.List;

/**
 * K次取反后最大化数组和
 */
public class LargestSumAfterKNegation {
    public int solution(int[] A,int K){
        for (int i=0;i<K;i++){
            int min=findMin(A);
            A[min]=-A[min];
        }
        int sum=0;
        for (int i=0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }

    private int findMin(int[] A){
        int min=0;
        for (int i=1;i<A.length;i++){
            min=A[min]<A[i]?min:i;
        }
        return min;
    }
}