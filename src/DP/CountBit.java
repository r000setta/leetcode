package DP;

public class CountBit {
    public int[] solution(int num){
        int[] res=new int[num+1];
        for (int i=1;i<=num;i++){
            res[i]=res[i/2]+(i%2);
        }
        return res;
    }
}