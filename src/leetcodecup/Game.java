package leetcodecup;

/**
 * LCP1.猜数字
 */
public class Game {
    public int solution(int[] guess,int[] answer){
        int t=0;
        for (int i=0;i<guess.length;i++){
            if (guess[i]==answer[i])
                t++;
        }
        return t;
    }
}
