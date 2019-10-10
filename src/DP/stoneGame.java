package DP;

/**
 * 877.石子游戏
 */
public class stoneGame {
    class State {
        public int fir;
        public int sec;

        public State(int fir, int sec) {
            this.fir = fir;
            this.sec = sec;
        }
    }

    public boolean solution(int[] piles) {
        int len = piles.length;
        State[][] dp = new State[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                dp[i][j] = new State(0,0);
            }
        }
        for (int i=0;i<len;i++){
            dp[i][i].fir=piles[i];
            dp[i][i].sec=0;
        }
        for (int l = 2; l <= len; l++) {
            for (int i = 0; i <= len - l; i++) {
                int j = l + i - 1;
                int left = piles[i] + dp[i + 1][j].sec;
                int right = piles[j] + dp[i][j - 1].sec;
                if (left > right) {
                    dp[i][j].fir = left;
                    dp[i][j].sec = dp[i + 1][j].fir;
                } else {
                    dp[i][j].fir = right;
                    dp[i][j].sec=dp[i][j-1].fir;
                }
            }
        }
        State res = dp[0][len - 1];
        int sub = res.fir - res.sec;
        if (sub>0)
            return true;
        return false;
    }
}
